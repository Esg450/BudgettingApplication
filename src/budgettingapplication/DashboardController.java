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
    
    public DashboardController()
    {
        //this.showDashboardUI();
        
    }
    
    public void showDashboardUI()
    {
        DashboardUI theDashboardUI = new DashboardUI(this);
        theDashboardUI.setVisible(true);
       
    }
    
 
    
    
}
