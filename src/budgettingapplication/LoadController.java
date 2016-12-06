/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;


import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author dak5332
 */
public class LoadController {
    
    private User user;
    private Connection c;
    
    public LoadController() {
        try {
            Class.forName("org.sqlite.JDBC");

        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    public void load() {
        this.load_user();
        this.loadBudgets();
        this.load_budget();
        
    }
    
    public void load_user() {
        Statement stmt = null;
        
        String fname = null;
        String lname = null;
        String email = null;
        int pin = 0;
        
        try {
          c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
          c.setAutoCommit(false);
          stmt = c.createStatement();
          ResultSet rs = stmt.executeQuery( "SELECT * FROM USER;" );
          while (rs.next()) {
              fname = rs.getString("FNAME");
              lname = rs.getString("LNAME");
              email = rs.getString("EMAIL");
              pin = rs.getInt("PIN");
          }
          stmt.close();
          c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        
        this.user = new User(fname, lname, email, pin);
    }
    
    public void load_budget() {

        Statement stmt = null;
        ArrayList<Transaction> list = new ArrayList();
        DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        
        try {
            c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM TRANS;" );
            while (rs.next()) {
                String name = rs.getString("NAME");
                double amount = rs.getDouble("AMOUNT");
                Date date = df.parse(rs.getString("DATE"));
                String budget = rs.getString("BUDGET_NAME");
                
                for(int i = 0; i < this.user.getBudgets().size(); i++)
                {
                    if(this.user.getBudgets().get(i).getName().equals(budget))
                    {
                        ArrayList<Transaction> trans = this.user.getBudgets().get(i).getTransactions();
                        trans.add(new Transaction(name, amount, date));
                        this.user.getBudgets().get(i).setTransactions(trans);
                    }
                }
            
                list.add(new Transaction(name, amount, date));
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        
        this.user.getBudgets().get(0).setTransactions(list);
   }
    
    public User getUser() {
        
        return this.user;
    }
    
    
    
    public void loadBudgets()
    {
         Statement stmt = null;
        ArrayList<Budget> list = new ArrayList();
       
        
        try {
            c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM BUDGET;" );
           
            while (rs.next()) {
                
                String name = rs.getString("NAME");
                String type = rs.getString("TYPE");
                double cap = rs.getDouble("CAP");
                
                list.add(new Budget(name, cap, type));
               
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        load_user();
        this.user.setBudgets(list);
        
        
        
    }
    
            
}

