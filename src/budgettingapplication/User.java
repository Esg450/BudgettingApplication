package budgettingapplication;

/**
 *
 * @author evangentis
 */
public class User {
    private String fName;
    private String lName;
    private String email;
    private int pin;
    
    public User() {
        this.fName = "John";
        this.lName = "Doe";
        this.email = "john.doe@email.email";
        this.pin = 1234;
    }
    
    public User(String f, String l, String e, int p) {
        this.fName = f;
        this.lName = l;
        this.email = e;
        this.pin = p;
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
    
    
}
