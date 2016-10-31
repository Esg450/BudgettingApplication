package budgettingapplication;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evangentis
 */
public class SettingsController {
    SettingsUI settings = new SettingsUI(this);
    private User user;
    
    public SettingsController(User u) {
        this.user = u;
    }
    
    public void showSettings() {
        settings.setVisible(true);
    }
    
    public void modifyUser(String f, String l, String e, int p) {
       this.user.setfName(f);
       this.user.setlName(l);
       this.user.setEmail(e);
       this.user.setPin(p);
        try {
            this.user.save_user();
            settings.setVisible(false);
            this.showDash();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showDash() {
        DashboardController dash = new DashboardController(this.user);
        dash.showDashboardUI();
        
    }
    public User getUser() {
        return this.user;
    }
    
}
