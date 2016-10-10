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
public class DashboardControllerTest {
    
    public DashboardControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of showDashboardUI method, of class DashboardController.
     */
    @Test
    public void testShowDashboardUI() {
        System.out.println("showDashboardUI");
        DashboardController instance = new DashboardController();
        instance.showDashboardUI();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
