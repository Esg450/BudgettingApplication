/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

/**
 *
 * @author katiebradley
 */
public class DashboardController {
    private User user;
    public DashboardController(User u)
    {
        //this.showDashboardUI();
        this.user = u;
        
    }
    
    public void showDashboardUI()
    {
        DashboardUI theDashboardUI = new DashboardUI(this);
        theDashboardUI.setVisible(true);
       
    }
    
    public User getUser() {
        
        return this.user;
    }
    
 
    
    
}
