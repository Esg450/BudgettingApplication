/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author dak5332
 */
public class SaveController {
    private User user;
    private Connection c;
    
    public SaveController(User u) {
        this.user = u;
        
        try {
            Class.forName("org.sqlite.JDBC").newInstance();

        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    
    public void setup_db() {
        
        Statement stmt = null;
        try {
          c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
          c.setAutoCommit(false);
          stmt = c.createStatement();
          String sqlCreateUser = "CREATE TABLE USER( "
                       + "ID INT, " +
                       " FNAME TEXT, " + 
                       " LNAME TEXT, " + 
                       " EMAIL TEXT, " + 
                       " PIN INT);"; 
          String sqlCreateNewUser = "INSERT INTO USER(ID, FNAME, LNAME, EMAIL, PIN) "
                  + "VALUES(1, '" + this.user.getfName() + "', '"  + this.user.getlName() + "', '" + this.user.getEmail() + "', " + this.user.getPin() + ");";
          
          String sqlCreateBudget = "CREATE TABLE BUDGET("
                  + "NAME TEXT PRIMARY KEY,"
                  + "TYPE TEXT,"
                  + "CAP TEXT);";
          
          String sqlCreateTransaction = "CREATE TABLE TRANS("
                  + "ID INT AUTO_INCREMENT PRIMARY KEY,"
                  + "BUDGET_NAME INT,"
                  + "NAME TEXT,"
                  + "AMOUNT INT,"
                  + "DATE TEXT);";

          stmt.executeUpdate(sqlCreateBudget);
          stmt.executeUpdate(sqlCreateUser);
          stmt.executeUpdate(sqlCreateTransaction);
          stmt.executeUpdate(sqlCreateNewUser);
          stmt.close();
          c.commit();
          c.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println("Initial tables created successfully");
    }
    
    
    public void save() {
        this.save_user();
        this.save_trans();
    }
    
    public void save_user()  {
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            
            String sqlUpdateUser = "UPDATE USER SET"
                    + " FNAME = '" + this.user.getfName() + "'"
                    + ", LNAME = '" + this.user.getlName() + "'"
                    + ", EMAIL = '" + this.user.getEmail() + "'"
                    + ", PIN = " + this.user.getPin()
                    + " WHERE ID = 1";
            
            stmt.executeUpdate(sqlUpdateUser);
            stmt.close();
            c.commit();
            c.close();
            
        } catch (Exception e) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
    }
    
    public void save_trans() {
        Statement stmt = null;
        
        try {
            c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            
            ArrayList<Budget> budgets = user.getBudgets();
            
            String budgetObject = null;
            stmt.executeUpdate("DELETE FROM TRANS");
            stmt.executeUpdate("DELETE FROM BUDGET");
            
            for(Budget b : budgets) {
               ArrayList<Transaction> trans = b.getTransactions();
               stmt.executeUpdate("INSERT INTO BUDGET(NAME, TYPE, CAP) VALUES ('" +  b.getName() + "', '" + b.getType() + "', " + b.getCap() + ");");
               for(Transaction t: trans) {    
                   stmt.executeUpdate("INSERT INTO TRANS(BUDGET_NAME, NAME, AMOUNT, DATE) VALUES ('" + b.getName() + "', '" + t.getName() + "', " + t.getAmount() + ", '" + t.getDate() + "')");
               }

            }
            
            stmt.close();
            c.commit();
            c.close();
            
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    
    public void addTrans(String bName,Transaction t) {

        Statement stmt = null;
        
        try {
            c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            
            stmt.executeUpdate("INSERT INTO TRANS(BUDGET_NAME, NAME, AMOUNT, DATE) VALUES ('" + bName + "', '" + t.getName() + "', " + t.getAmount() + ", '" + t.getDate() + "')");
            
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        
        
       

    }
    
     public void add_budget(Budget b)
        {
            
             Statement stmt = null;
        
        try {
            c = DriverManager.getConnection("jdbc:sqlite:budgetApp.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            
               stmt.executeUpdate("INSERT INTO BUDGET(NAME, TYPE, CAP) VALUES ('" +  b.getName() + "', '" + b.getType() + "', " + b.getCap() + ");");
            
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        }
    

}
