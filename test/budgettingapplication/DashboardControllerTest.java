package budgettingapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evangentis
 */
public class DashboardControllerTest {
    
    public DashboardControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of showDashboardUI method, of class DashboardController.
     */
    @Test
    public void testShowDashboardUI() {
        System.out.println("showDashboardUI");
        User u = new User();
        DashboardController instance = new DashboardController(u);
        instance.showDashboardUI();
    }

    /**
     * Test of getUser method, of class DashboardController.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        User u = new User();
        User expResult = new User();
        DashboardController instance = new DashboardController(u);
        User result = instance.getUser();
        assertEquals(expResult.getPin(), result.getPin());
    }
    
}
