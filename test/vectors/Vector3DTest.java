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
public class Vector3DTest {
    
    public Vector3DTest() {
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
        System.out.println("jestem w metodzie tearDown");
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(3,4,5);
        double expResult = Math.sqrt(3*3+4*4+5*5);;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(3,4,5);
        Vector3D instance = new Vector3D(3,4,5);
        Vector3D expResult = new Vector3D(3+3,4+4,5+5);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 0.0;
        Vector3D instance = new Vector3D(3,4,5);
        Vector3D expResult = new Vector3D(alpha*3, alpha*4, alpha*5);;
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(6,8,10);
        Vector3D instance = new Vector3D(3,4,5);
        double expResult = (3*6+4*8+5*10);
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(3,4,5);
        Vector3D instance = new Vector3D(3,4,5);
        Vector3D expResult = new Vector3D(4*5-5*4, 5*3-3*5, 3*5-4*3);
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(3,4,5);
        String expResult = "[3.0, 4.0, 5.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(3,4,5);
        Vector3D instance = new Vector3D(3,4,5);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
       
    }
    
}
