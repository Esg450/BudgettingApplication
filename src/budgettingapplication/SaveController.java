/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dak5332
 */
public class SaveController {
    private User user;
    
    public SaveController(User u) {
        this.user = u;
    }
    
    public void save() throws FileNotFoundException {
        this.save_user();
        this.save_trans();
    }
    
    public void save_user() throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter("save_user.csv")) {
            out.println(this.user.getfName());
            out.println(this.user.getlName());
            out.println(this.user.getEmail());
            out.println(this.user.getPin());
        }
        
    }
    
    public void save_trans() throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter("save_budget.csv")) {
            ArrayList<Budget> budgets = user.getBudgets();
            
            String budgetObject = null;
            for(Budget b : budgets)
            {
               ArrayList<Transaction> trans = b.getTransactions();
               budgetObject = b.getName() + "," + b.getType() + "," + b.getCap() + "\n";
              // budgetObject += "*\n";
               for(Transaction t: trans)
               {    
                   
                   budgetObject += t.getName() + "," + t.getAmount() + "," + t.getDate() + "\n";
               }
             //  budgetObject += "*";
                
            }
            out.println(budgetObject);
        }
    }
    
    public void addTrans(String bName,Transaction t) throws FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("save_budget.csv"));
        String budget = in.nextLine();
        String oldTrans = "";
        while(in.hasNextLine())
        {
            oldTrans += in.nextLine() + "\n";
        }
        in.close();
        PrintWriter out = new PrintWriter("save_budget.csv");
        out.println(budget);
        out.print(oldTrans);
        out.print(t.getName() + "," + t.getAmount() + "," + t.getDate() + "\n");
        out.close();
       
        
        
    }
    

}
