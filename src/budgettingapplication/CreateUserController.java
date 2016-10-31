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
        try {
            u.save();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateUserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        createUser.setVisible(false);
        UserController controller = new UserController(u);
        controller.showLogin();
    }
    
}
