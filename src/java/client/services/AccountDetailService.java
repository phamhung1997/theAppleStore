/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.services;

import entity.AccountDetail;
import model.AccountDetailModel;

/**
 *
 *
 */
public class AccountDetailService {
    AccountDetailModel accountDetailModel = new AccountDetailModel();
    
    public int addAccountDetail(AccountDetail accountDetail){
        return accountDetailModel.addAccountDetail(accountDetail);
    }
}
