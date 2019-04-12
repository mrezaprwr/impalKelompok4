/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservasi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reza Siahaan
 */
public class pesananCobaTest {
    
    public pesananCobaTest() {
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
     * Test of getLamaNginap method, of class pesananCoba.
     */
    @Test
    public void testGetLamaNginap() throws Exception {
        System.out.println("getLamaNginap");
        String checkIn = "05/14/2012";
        String checkOut = "05/20/2012";
        pesananCoba instance = new pesananCoba();
        long expResult = 6;
        long result = instance.getLamaNginap(checkIn, checkOut);
        assertEquals(expResult, result);
    }

    /**
     * Test of tarifKamar method, of class pesananCoba.
     */
    @Test
    public void testTarifKamar() {
        System.out.println("tarifKamar");
        String tipeKamar = "standard";
        pesananCoba instance = new pesananCoba();
        double expResult = 250000;
        double result = instance.tarifKamar(tipeKamar);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of totalHarga method, of class pesananCoba.
     */
    @Test
    public void testTotalHarga() throws Exception {
        System.out.println("totalHarga");
        pesananCoba instance = new pesananCoba();
        String tipeKamar = "standard";
        double expResult = 0.0;
        double result = instance.totalHarga();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
