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
public class NotificationController {
 
    public NotificationController(){
    
    
        double cap;
        cap = this.getBudget();
        int limit = 50;
        
    }
    
    public double getBudget(){
        
        Budget theBudget = new Budget("name", 11, "type");
        
        double cap = theBudget.getCap();

        return cap;
       
    }
    
    
    public void checkBudget(double cap, int limit){
       
           if(cap < limit){
               
               System.out.println("You are close to end of budget - there is "+ limit+ " dollar(s) left");
           
       }
        
    }
}


