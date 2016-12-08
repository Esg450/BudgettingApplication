/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author katiebradley
 */
public class DashboardController {
    private User user;
    private Connection c;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    
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
    



