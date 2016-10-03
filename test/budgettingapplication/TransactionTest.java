/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgettingapplication;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dak5332 - dylankolson
 */
public class TransactionTest {

    public TransactionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Transaction.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Transaction.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "new";
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        instance.setName(name);

        String result = instance.getName();
        assertEquals(name, result);

    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        double expResult = 500.0;

        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setAmount method, of class Transaction.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 0.0;
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        double expResult = 0.0;
        instance.setAmount(amount);
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getType method, of class Transaction.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        String expResult = "Food";
        String result = instance.getType();
        assertEquals(expResult, result);

    }

    /**
     * Test of setType method, of class Transaction.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        String type = "food";
        instance.setType(type);

        String result = instance.getType();
        assertEquals("food", result);

    }

    /**
     * Test of getDate method, of class Transaction.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        Date expResult = today;
        Date result = instance.getDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDate method, of class Transaction.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date today = new Date();
        Transaction instance = new Transaction("name", 500, "Food", today);
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24)); //chaneg the date by 1

        instance.setDate(tomorrow);
        Date expResult = tomorrow;
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

}
