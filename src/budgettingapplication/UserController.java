/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

/**
 *
 * @author Evan
 */
public class UserController {
    public void showLogin() {
        LoginUI loginWin = new LoginUI(this);
        loginWin.setVisible(true);
    }
}
