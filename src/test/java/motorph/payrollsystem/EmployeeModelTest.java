/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package motorph.payrollsystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gamer
 */
public class EmployeeModelTest {
    
    public EmployeeModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEmployeeModelList method, of class EmployeeModel.
     */
    @Test
    public void testGetEmployeeModelList() {
        System.out.println("getEmployeeModelList");
        EmployeeModel instance = new EmployeeModelImpl();
        EmployeeData[] expResult = null;
        EmployeeData[] result = instance.getEmployeeModelList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EmployeeModelImpl extends EmployeeModel {

        public EmployeeData[] getEmployeeModelList() {
            return null;
        }
    }
    
}