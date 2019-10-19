/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.services;

import model.AccountModel;
import entity.Account;

/**
 *
 *
 */
public class AccountService {
    AccountModel accountModel = new AccountModel();
    
    /** 
     * processLogin service
     * @param email
     * @param password
     * @return Account
     */
    public Account processLogin(String email, String password){
        return accountModel.login(email, password);
    }
    
    public boolean add(Account account){
        return accountModel.add(account);
    }
    
    public boolean isCheckDuplicateEmail(String email){
        return accountModel.isCheckDuplicateEmail(email);
    }
    
    public boolean activeCode(String email, String code){
        return accountModel.activeCode(email, code);
    }
}
