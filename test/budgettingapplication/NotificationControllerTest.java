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
public class NotificationControllerTest {
    
    public NotificationControllerTest() {
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
     * Test of getBudget method, of class NotificationController.
     */
    @Test
    public void testGetBudget() {
        System.out.println("getBudget");
        NotificationController instance = new NotificationController();
        double expResult = 11.0;
        double result = instance.getBudget();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of checkBudget method, of class NotificationController.
     */
    @Test
    public void testCheckBudget() {
        System.out.println("checkBudget");
        double cap = 0.0;
        int limit = 0;
        NotificationController instance = new NotificationController();
        instance.checkBudget(cap, limit);
    }
    
}
