/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class Vector2DTest {
    
    public Vector2DTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("jestem w metodzie setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("jestem w metodzie tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("jestem w metodzie setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("jestem w metodzie tearDownClass");
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Vector2D instance = new Vector2D(4,5);
        double expResult = Math.sqrt(4*4+5*5);
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D anotherVector = new Vector2D(2,6);
        Vector2D instance = new Vector2D(2,6);
        Vector2D expResult = new Vector2D(2+2,6+6);
        Vector2D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 0.0;
        Vector2D instance = new Vector2D(4,5);
        Vector2D expResult = new Vector2D(alpha*4, alpha);
        Vector2D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector2D anotherVector = new Vector2D(4,12);
        Vector2D instance = new Vector2D(2,5);
        double expResult = (2*4+5*12);
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(2,6);
        String expResult = "[2.0, 6.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector2D(2,6);
        Vector2D instance = new Vector2D(2,6);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        
    }
    
}
