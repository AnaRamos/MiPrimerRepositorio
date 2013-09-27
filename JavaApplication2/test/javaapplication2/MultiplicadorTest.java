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
public class MultiplicadorTest {
    
    public MultiplicadorTest() {
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
     * Test of multiplicar method, of class Multiplicador.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 7;
        int b = 5;
        Multiplicador instance = new Multiplicador();
        int expResult = 35;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cuadrado method, of class Multiplicador.
     */
    @Test
    public void testCuadrado() {
        System.out.println("cuadrado");
        int a = 9;
        Multiplicador instance = new Multiplicador();
        int expResult = 81;
        int result = instance.cuadrado(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
