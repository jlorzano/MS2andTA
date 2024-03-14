/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph.payrollsystem;

/**
 *
 * @author gamer
 */
public class EmployeeHoursSalary {
    
    //This is where we indicate which index we need to calculate the GrossEarnings (hours worked multipled by the hourly rate).
    public double getSalaryOnHoursWorked(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
               
}
