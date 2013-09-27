/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Win7
 */
public class NewClassTest {
    
    public NewClassTest() {
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
     * Test of esPar method, of class NewClass.
     */
    @Test
    public void testEsPar() {
        System.out.println("esPar");
        int numero = 0;
        NewClass instance = new NewClass();
        boolean expResult = true;
        boolean result = instance.esPar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEsParII() {
        System.out.println("esPar");
        int numero = 15;
        NewClass instance = new NewClass();
        boolean expResult = false;
        boolean result = instance.esPar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEsParIII() {
        System.out.println("esPar");
        int numeroA = 15;
        int numeroB = 32;
        NewClass instance = new NewClass();
        int expResult = 47;
        int result = instance.sumar(numeroA, numeroB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
