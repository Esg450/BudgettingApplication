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
        UserController user = new UserController();
        user.showLogin();

        File f = new File("save.csv");
        if (!f.exists()) {
            System.out.print("Creating Save File");
            user.save();
        }
        LoadController l = new LoadController(user);
        l.load();
        //System.out.print(user.getUser().getBudgets().get(0).getTransactions().get(1).getName());

    }

}
