/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.services;

import entity.Category;
import java.util.ArrayList;
import model.CategoryModel;

/**
 *
 *
 */
public class CategoryService {
    CategoryModel categoryModel = new CategoryModel();
   
    public ArrayList<Category> getCategoris(){
        return categoryModel.getAll();
    }
}
