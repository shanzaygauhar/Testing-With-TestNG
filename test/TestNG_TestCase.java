/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testing.with.testng.TestingWithTestNG;

/**
 *
 * @author ShanzayGauhar
 */
public class TestNG_TestCase {
    
    public TestNG_TestCase() {
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void MultiplyTwoIntegersTestCase(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedOutput = 20; //or we can write as firstNumber * secondNumber
        
        final int actualOutput = TestingWithTestNG.multiply(firstNumber, secondNumber);
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void AddTwoIntegersTestCase(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedOutput = 12; //or we can write as firstNumber + secondNumber
        
        final int actualOutput = TestingWithTestNG.add(firstNumber, secondNumber);
        assertEquals(actualOutput,expectedOutput);
    }
     @Test
    public void SubtractTwoIntegersTestCase(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedOutput = 8; //or we can write as firstNumber - secondNumber
        
        final int actualOutput = TestingWithTestNG.subtract(firstNumber, secondNumber);
        assertEquals(actualOutput,expectedOutput);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
