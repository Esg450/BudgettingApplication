/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.util.ArrayList;

/**
 *
 * @author ykawa
 */
public class Budget {
    private String name;
    private double cap;
    private String type;
    private ArrayList<Transaction> transactions = new ArrayList<>();

  
     

    public Budget(String name, double cap, String type) {
        this.name = name;
        this.cap = cap;
        this.type = type;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCap() {
        return cap;
    }

    public void setCap(double cap) {
        this.cap = cap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
      public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    
}
