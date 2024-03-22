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

/*This JUnit test aims to see if when the Employee ID is entered it will redirect the user to the main menu where they can select from 3 options
  1. employee information, 2. gross earnings and 3. net earnings.
  The test should display the necessary information based on the selection made by the user.
  Option one should display at least the following information (employee id, employee name and date of birth)
  Option two should display at least the following information (employee id, employee name, hours worked, and gross earnings)
  Option three should display at least the following information (employee id, employee name, hours worked, gross earnings, total benefits, total deduction and net earnings)
  After each and every option the user should be able to either go back to the main menu or exit the program.
*/

public class PayrollSystemTest {
    
    public PayrollSystemTest() {
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
     * Test of main method, of class PayrollSystem.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        PayrollSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
