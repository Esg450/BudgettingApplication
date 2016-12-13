package budgettingapplication;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evangentis
 */
public class CreateUserController {
    CreateUserUI createUser = new CreateUserUI(this);
    
    public void showCreateUser() {
        createUser.setVisible(true);
    }
    
    public void createUser(String f, String l, String e, int p, String bName, String bType, double bAmount) {
        User u = new User(f, l, e, p);
        u.addBudget(bName, bType, bAmount);
        SaveController s = new SaveController(u);
        s.setup_db();
        s.save();
        createUser.setVisible(false);
        UserController controller = new UserController(u);
        controller.showLogin();
    }
    
}
