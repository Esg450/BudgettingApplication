/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.util.Date;

/**
 *
 * @author dylankolson
 */
public class TransactionController {
    
    public TransactionController()
    {
        this.showLoginUI();
        
    }
    
    
    public void showLoginUI()
    {
        TransactionUI theTransactionUI = new TransactionUI(this);
        theTransactionUI.setVisible(true);
       
    }
    
    public void add(double amount, String name, String type)
    {
        Date today = new Date();
        Transaction temp = new Transaction(name,amount,today);
        
        //TO DO add transaction to budget
        
    }
}
