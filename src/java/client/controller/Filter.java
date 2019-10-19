/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.services.CategoryService;
import client.services.ProductService;
import entity.Category;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 
 */
@WebServlet(name = "Filter", urlPatterns = {"/filter"})
public class Filter extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String categoryID = request.getParameter("categoryId");
            String minPrice = request.getParameter("min");
            String maxPrice = request.getParameter("max");
            System.out.println("categoryId ===== " + categoryID);

            CategoryService categoryService = new CategoryService();
            ProductService productService = new ProductService();

            ArrayList<Category> listCategory = categoryService.getCategoris();
            request.setAttribute("listCategory", listCategory);

            ArrayList<Product> listProduct = new ArrayList<>();
            listProduct = productService.getProducts();

            if (categoryID != null) {
                int id = Integer.parseInt(categoryID);
                System.out.println("categoryId xxx ===== " + id);
                listProduct = productService.getProductsByCategory(id);
            }
            if (minPrice != null && maxPrice != null) {
                int min = Integer.parseInt(minPrice);
                int max = Integer.parseInt(maxPrice);
                listProduct = productService.getProductsByPrice(min, max);
            }
            if (listProduct != null) {
                request.setAttribute("listProduct", listProduct);
            } else {
                request.setAttribute("listProduct", null);
                System.out.println("List Product null");
            }
            System.out.println("list xxx ===== " + listProduct);
            request.getRequestDispatcher("products.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
