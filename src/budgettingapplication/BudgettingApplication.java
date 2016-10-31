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
        File f1 = new File("save_budget.csv");
        File f2 = new File("save_user.csv");
        if (!f1.exists() && !f2.exists()) {
            CreateUserController createUser = new CreateUserController();
            createUser.showCreateUser();
            System.out.print("Creating Save File");
        } else {
            LoadController l = new LoadController();
            l.load();
            
            UserController user = new UserController(l.getUser());
            user.showLogin();
        }

        //System.out.print(user.getUser().getBudgets().get(0).getTransactions().get(1).getName());

    }

}
