package budgettingapplication;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evangentis
 */
public class BudgettingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        //test to show transaction UI
        //TransactionController controller = new TransactionController();
        
        //Test to show login
        UserController user = new UserController();
        user.showLogin();
         user.save();
    }
    
}
