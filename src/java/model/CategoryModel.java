/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.ICommon;

/**
 *
 *
 */
public class CategoryModel implements ICommon<Category>{
    
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<Category> getAll() {
        ArrayList<Category> list = new ArrayList<>();
        String query = "SELECT * FROM Categories";
        try {
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(
                        rs.getInt(1),
                        rs.getString(2)
                );
                list.add(category);
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }
 @Override
    public Category getOne(int id) {
        String query = "SELECT * FROM Categories WHERE Id = ?";
        try {
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Category category = new Category(
                        rs.getInt(1),
                        rs.getString(2)
                );
                return category;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public boolean add(Category obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Category obj, int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
