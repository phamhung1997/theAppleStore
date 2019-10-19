/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.Account;
import utils.ICommon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.BCrypt;

/**
 *
 *
 */
public class AccountModel implements ICommon<Account>{
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
        
    /**
     * Authentication information user input login
     * @param email
     * @param password
     * @return object Account
     */
    public Account login(String email, String password){
        String query = "SELECT * FROM Account WHERE Email = ?";
        try{
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if(rs.next()){
                Account account = new Account(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getString(7)
                );
                if(BCrypt.checkpw(password, account.getPassword())){
                    return account;
                }
            }
            return null;
        }catch(SQLException e){
            System.out.println(e);                
        }finally{
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }
    
    public boolean isCheckDuplicateEmail(String email){
        String query = "SELECT * FROM Account WHERE Email = ?";
        try{
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            return rs.next();
        }catch(SQLException e){
            System.out.println(e);                
        }finally{
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return false;
    }
    
    public boolean activeCode(String email, String activeCode){
        int isCheck = 0;
        String query = "UPDATE Account SET Status = 1 WHERE Email = ? AND Active_Code = ?";
        try{
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, activeCode);
            isCheck = ps.executeUpdate(); 
        }catch(SQLException e){
            System.out.println(e);                
        }finally{
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return isCheck > 0;
    }

    /**
     * Get all Account in Database
     * @return list object Account
     */
    @Override
    public ArrayList<Account> getAll() {
        return null;
    }

    /**
     * Get one Account by Id
     * @param id
     * @return one object Account
     */
    @Override
    public Account getOne(int id) {
        return null;
    }

    /**
     * Insert one Account to Database
     * @param account
     * @return true if insert Account success
     *         false if insert Account fail
     */
    @Override
    public boolean add(Account account) {
        int isCheck = 0;
        String query = "INSERT INTO Account(Email, Password, Account_Detail_Id, Role_ID, Status, Active_Code) VALUES(?, ?, ?, ?, ?, ?)";
        try{
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, account.getEmail());         
            ps.setString(2, BCrypt.hashpw(account.getPassword(), BCrypt.gensalt()));
            ps.setInt(3, account.getAccountDetailId());
            ps.setInt(4, account.getRoleId());
            ps.setInt(5, account.getStatus());
            ps.setString(6, account.getActiveCode());
            isCheck = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);                
        }finally{
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return isCheck > 0;
    }

    /**
     * Update info one Account in Database
     * @param account
     * @param id
     * @return true if update Account success
     *         false if update Account fail
     */
    @Override
    public boolean update(Account account, int id) {
        return false;
    }

    /**
     * Delete one Account in Database by Id
     * @param id
     * @return true if delete Account success
     *         false if delete Account fail
     */
    @Override
    public boolean delete(int id) {
        return false;
    }
    
}