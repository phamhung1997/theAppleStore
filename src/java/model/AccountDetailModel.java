/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.AccountDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.ICommon;

/**
 *
 * 
 */
public class AccountDetailModel implements ICommon<AccountDetail>{
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    /**
     * Insert one AccountDetail to Database and return Id
     * @param accountDetail
     * @return Id AccountDetail inserted
     */
    public int addAccountDetail(AccountDetail accountDetail){
        String query = "INSERT INTO Account_Detail(Name, Phone_Number, Gender, Address) VALUES(?, ?, ?, ?)";
        try{
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, accountDetail.getName());
            ps.setString(2, accountDetail.getMobile());
            ps.setInt(3, accountDetail.getGender());
            ps.setString(4, accountDetail.getAddress());
            int isCheck = ps.executeUpdate();
            if(isCheck > 0){
                rs = ps.getGeneratedKeys();
                rs.next();
                return rs.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);                
        }finally{
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return 0;    
    }
    
    /**
     * Get all AccountDetail in Database
     * @return list object AccountDetail
     */
    @Override
    public ArrayList<AccountDetail> getAll() {
        return null;
    }

    /**
     * Get one AccountDetail by Id
     * @param id
     * @return one object AccountDetail
     */
    @Override
    public AccountDetail getOne(int id) {
        return null;
    }

    /**
     * Insert one AccountDetail to Database
     * @param accountDetail
     * @return true if insert AccountDetail success
     *         false if insert AccountDetail fail
     */
    @Override
    public boolean add(AccountDetail accountDetail) {
        return false;
    }

    /**
     * Update info one AccountDetail in Database
     * @param accountDetail
     * @param id
     * @return true if update AccountDetail success
     *         false if update AccountDetail fail
     */
    @Override
    public boolean update(AccountDetail accountDetail, int id) {
        return false;
    }

    /**
     * Delete one AccountDetail in Database by Id
     * @param id
     * @return true if delete AccountDetail success
     *         false if delete AccountDetail fail
     */
    @Override
    public boolean delete(int id) {
        return false;
    }
}
