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
public class EmployeeHoursSalaryTest {
    
    public EmployeeHoursSalaryTest() {
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
     * Test of getSalaryOnHoursWorked method, of class EmployeeHoursSalary.
     */
    @Test
    public void testGetSalaryOnHoursWorked() {
        System.out.println("getSalaryOnHoursWorked");
        double hoursWorked = 0.0;
        double hourlyRate = 0.0;
        EmployeeHoursSalary instance = new EmployeeHoursSalary();
        double expResult = 0.0;
        double result = instance.getSalaryOnHoursWorked(hoursWorked, hourlyRate);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
