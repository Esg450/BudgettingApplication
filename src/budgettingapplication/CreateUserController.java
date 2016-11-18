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
    
    public void createUser(String f, String l, String e, int p) {
        User u = new User(f, l, e, p);
        SaveController s = new SaveController(u);
        s.setup_db();
        createUser.setVisible(false);
        UserController controller = new UserController(u);
        controller.showLogin();
    }
    
}
