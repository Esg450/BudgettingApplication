package budgettingapplication;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author evangentis
 */
public class User {
    private String fName;
    private String lName;
    private String email;
    private int pin; 
    private ArrayList<Budget> budgets = new ArrayList<>();
    
    public User() {
        this.fName = "John";
        this.lName = "Doe";
        this.email = "john.doe@email.email";
        this.pin = 1234;
        budgets.add(new Budget("Food Budget for July",500,"Food"));
        
    }
    
    public User(String f, String l, String e, int p) {
        this.fName = f;
        this.lName = l;
        this.email = e;
        this.pin = p;

    }

    public void addBudget(String n, String t, double a) {
        this.budgets.add(new Budget(n, a, t));
    }
    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    public ArrayList<Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(ArrayList<Budget> budgets) {
        this.budgets = budgets;
    }
    
        
    public void save() throws FileNotFoundException
    {
        SaveController save =  new SaveController(this);
        save.save();
        
    }
    
    public void save_user() throws FileNotFoundException {
        SaveController save =  new SaveController(this);
        save.save_user();
    }
}
