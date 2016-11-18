package budgettingapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
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
    public static void main(String[] args) throws FileNotFoundException, ParseException {

        //test to show transaction UI
        //TransactionController controller = new TransactionController();
        //Test to show login
        File dbName = new File("budgetApp.db");
        
        if (dbName.exists()) {
            LoadController l = new LoadController();
            l.load();
            
            UserController user = new UserController(l.getUser());
            user.showLogin();
            
        } else {
            CreateUserController createUser = new CreateUserController();
            createUser.showCreateUser();
            System.out.print("Creating new user");            
            
        }
        //System.out.print(user.getUser().getBudgets().get(0).getTransactions().get(1).getName());

    }

}
