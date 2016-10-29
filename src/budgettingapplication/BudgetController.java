/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.io.FileNotFoundException;

/**
 *
 * @author ykawa
 */
public class BudgetController {
   
        public BudgetController()
    {
        this.showLoginUI();
        
    }
    
    
    public void showLoginUI()
    {
        BudgetUI theBudgetUI = new BudgetUI(this);
        theBudgetUI.setVisible(true);
       
    }
    
    public void add(double amount, String name, String type)
    {
      
        Budget temp = new Budget(name,amount,type);
        
        
        
    }
}
