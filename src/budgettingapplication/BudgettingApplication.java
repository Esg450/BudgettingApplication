package budgettingapplication;

/**
 *
 * @author evangentis
 */
public class BudgettingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //test to show transaction UI
        //TransactionController controller = new TransactionController();
        
        //Test to show login
        UserController user = new UserController();
        user.showLogin();
    }
    
}
