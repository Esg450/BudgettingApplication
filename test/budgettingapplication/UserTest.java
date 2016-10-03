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
public class UserTest {
    
    public UserTest() {
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
     * Test of getfName method, of class User.
     */
    @org.junit.Test
    public void testGetfName() {
        System.out.println("getfName");
        User instance = new User();
        String expResult = "John";
        String result = instance.getfName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setfName method, of class User.
     */
    @org.junit.Test
    public void testSetfName() {
        System.out.println("setfName");
        String fName = "test";
        User instance = new User();
        instance.setfName(fName);
        String result = instance.getfName();
        assertEquals(fName, result);
    }

    /**
     * Test of getlName method, of class User.
     */
    @org.junit.Test
    public void testGetlName() {
        System.out.println("getlName");
        User instance = new User();
        String expResult = "Doe";
        String result = instance.getlName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setlName method, of class User.
     */
    @org.junit.Test
    public void testSetlName() {
        System.out.println("setlName");
        String lName = "test";
        User instance = new User();
        instance.setlName(lName);
        String result = instance.getlName();
        assertEquals(lName, result);
    }

    /**
     * Test of getEmail method, of class User.
     */
    @org.junit.Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User();
        String expResult = "john.doe@email.email";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @org.junit.Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "test";
        User instance = new User();
        instance.setEmail(email);
        String result = instance.getEmail();
        assertEquals(email, result);
    }

    /**
     * Test of getPin method, of class User.
     */
    @org.junit.Test
    public void testGetPin() {
        System.out.println("getPin");
        User instance = new User();
        int expResult = 1234;
        int result = instance.getPin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPin method, of class User.
     */
    @org.junit.Test
    public void testSetPin() {
        System.out.println("setPin");
        int pin = 0;
        User instance = new User();
        instance.setPin(pin);
        int result = instance.getPin();
        assertEquals(pin, result);
    }
    
}
