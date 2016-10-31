/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.io.FileNotFoundException;

/**
 *
 * @author Evan
 */
public class UserController {
    private User user;
    LoginUI loginWin = new LoginUI(this);
    
    public UserController(User u) {
        this.user = u;
    }
    
    public void showLogin() {
         
        loginWin.setVisible(true);
    }
    
    public void showDash() {
        DashboardController dash = new DashboardController(this.user);
        dash.showDashboardUI();
        loginWin.setVisible(false);
    }
    
    public boolean checkPin(int p) {
        return this.user.getPin() == p;
    }
    
    public User getUser()
    {
        return user;
    }
}
