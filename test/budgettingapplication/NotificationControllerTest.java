/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author katiebradley
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

    /**
     * Test of getBudget method, of class NotificationController.
     */
    @Test
    public void testGetBudget() {
        System.out.println("getBudget");
        NotificationController instance = new NotificationController();
        double expResult = 0.0;
        double result = instance.getBudget();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
