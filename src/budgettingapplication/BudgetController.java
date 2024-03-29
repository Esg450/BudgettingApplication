/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ykawa
 */

public class BudgetController {
   BudgetUI theBudgetUI; 
   User user;
        public BudgetController(User u)
    {
        //this.showLoginUI();
        this.user = u;
    }
    
    
    public void showLoginUI()
    {
         theBudgetUI = new BudgetUI(this);
        theBudgetUI.setVisible(true);
       
    }
    
    public void add(double amount, String name, String type)
    {
        this.user.addBudget(name, type, amount);        
       try {
           this.user.save();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(BudgetController.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    void getMainMenu() {
         theBudgetUI.setVisible(false);
        DashboardController dash = new DashboardController(this.user);
        dash.showDashboardUI();
    }
}
