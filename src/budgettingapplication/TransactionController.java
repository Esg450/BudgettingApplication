/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dylankolson
 */
public class TransactionController {
    TransactionUI theTransactionUI;
    public TransactionController()
    {
       // this.showLoginUI();
        
    }
    
    
    public void showTransactionUI()
    {
        theTransactionUI = new TransactionUI(this);
        theTransactionUI.setVisible(true);
       
    }
    
    public void add(double amount, String name, String budgetName) throws FileNotFoundException
    {
        Date today = new Date();
        Transaction temp = new Transaction(name,amount,today);
        
        
        //get the budget to add the transaction to
        UserController u = new UserController();
        User person = u.getUser();
        ArrayList<Budget> budgets = person.getBudgets();
        Budget b = null;
        for(int i = 0; i < budgets.size(); i++)
        {
            if(budgets.get(i).getName().equals(budgetName))
            {
                b = budgets.get(i);
            }
        }
        
        if(b != null)
        {
            ArrayList<Transaction> t = b.getTransactions();
            for(Transaction a: t)
            { 
                System.out.print(a.getName());
            }
            t.add(temp);
            b.setTransactions(t);
        }
        
        System.out.println("Transaction Saved to "  + budgetName);
        //u.save();
        
        SaveController s = new SaveController();
        s.addTrans(budgetName, temp);
        
    }
    
    
    public void getMainMenu()
    {
        theTransactionUI.setVisible(false);
        DashboardController dash = new DashboardController();
        dash.showDashboardUI();
    }
}
