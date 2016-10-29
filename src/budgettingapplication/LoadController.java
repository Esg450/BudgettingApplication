/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dak5332
 */
public class LoadController {
    
    private User user; 
    public LoadController(UserController u)
    {
        user = u.getUser();
    }
    
    
    public void load() throws FileNotFoundException, ParseException
    {
        Scanner in = new Scanner(new FileReader("save.csv"));
        String budget = in.nextLine();
        in.nextLine();
        ArrayList<Transaction> list = new ArrayList();
        DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy"); 
        in.useDelimiter(",|\\n");
        while(in.hasNextLine())
        {
            
            String name = in.next();
            double amount =  in.nextDouble();
            
            String day = in.next();
   
            Date date = df.parse(day);
            
            //System.out.println(name + "," + amount + "," + date);
            list.add(new Transaction(name,amount,date));
            System.out.println(in.nextLine());
            
        }
        
       
        
        user.getBudgets().get(0).setTransactions(list);
            
        
    }
    
}

