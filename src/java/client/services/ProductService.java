/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.services;

import entity.Product;
import java.util.ArrayList;
import model.ProductModel;

/**
 *
 *
 */
public class ProductService {
    ProductModel productModel = new ProductModel();
    
    public ArrayList<Product> getProducts(){
        return productModel.getAll();
    }
    
    public ArrayList<Product> getProductsByCategory(int categoryId){
        return productModel.getAllProductsByCategory(categoryId);
    }
    
    public ArrayList<Product> getProductsByPrice(int min, int max){
        return productModel.getAllProductsByPrice(min, max);
    }
    
    public Product getProductDetail(int id){
        return productModel.getOne(id);
    }
    
    
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        System.out.println(ps.productModel.getOne(9));
    }
}
