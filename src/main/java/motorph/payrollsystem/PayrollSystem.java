/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package motorph.payrollsystem;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author gamer
 */
public class PayrollSystem {
    //this code "DecimalFormat" sets the decimal value format of each double into 2 decimal points.
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static EmployeeModel employeeModel;
    
    public static void main(String[] args) throws InterruptedException, IOException {
        getDefaultEmployeeModel();
        menuSelect();
    }
    
//Welcome messaging after the user logs in.
private static void menuSelect() throws InterruptedException, IOException {
    System.out.println("=====================================");
    System.out.println("Welcome to the MotorPH Payroll System");
    System.out.println("=====================================");
    
    Scanner sel = new Scanner(System.in);
    Thread.sleep(1000);
    System.out.println("Please select an option from the menu");
    System.out.println("=====================================");
    System.out.println("1. Employee Information");
    System.out.println("2. View Gross Earnings");
    System.out.println("3. View Net Earnings");
    System.out.println("=====================================");
    System.out.print("Enter a selection: ");
    String select = sel.nextLine();
    selectOpt(select);
    sel.close();
    }

//Menu Selection
private static void selectOpt(String select) throws IOException, InterruptedException  {
    switch(select) {
        case "1":
            EmployeeInformation();
            break;
        case "2":
            EmployeeGrossEarnings();
            break;
        case "3":
            EmployeeNetEarnings();
            break;
        default:
            break;
    }
}

//This method intiates the user login by entering their userID stored on the CSV file.
private static void getDefaultEmployeeModel() throws IOException {
        employeeModel = new GetEmployeeDataFromFile() {};
}

//This method pulls specific employee information required by motorPH (employee number/ID, name, date of birth and i added the status and position as well"
private static void EmployeeInformation() throws IOException, InterruptedException {
    //New object instancing
    EmployeeData[] employeeList = employeeModel.getEmployeeModelList();
        System.out.println("=====================================");
        System.out.println("Employee Information ");
        System.out.println("=====================================");
    //For loop statement used to go thru the stored csv data.    
    for (int a = 0; a < employeeList.length; a++) {
        //This IF statement is to check if the value on the array is not NULL so we can avoid the NullPointerException error message.
        if (employeeList[a] != null) {
        EmployeeData employee = employeeList[a];
        System.out.println("Employee ID: " + employee.getEmpId() + "     " + "Status: " + employee.getStatus());
        System.out.println("Employee Name: " + employee.getFirstName() + employee.getLastName());
        System.out.println("DOB: " + employee.getBirthday() + "     " + "Position: " + employee.getPosition());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("=====================================");
        goBacktoMenu();
    }
}
}

//This method pulls the gross earnings of the employee, the CSV file contains the total hours worked and it is multiplied by the hourly rate and this calculation is performed
//under the EmployeeHoursSalary class.
private static void EmployeeGrossEarnings() throws InterruptedException, IOException {
    //New object instancing
    EmployeeData[] employeeList = employeeModel.getEmployeeModelList();
    EmployeeHoursSalary wSalary = new EmployeeHoursSalary(); 
        System.out.println("=====================================");
        System.out.println("Employee Gross Earnings Data ");
        System.out.println("=====================================");
    //For loop statement used to go thru the stored csv data.    
    for (int b = 0; b < employeeList.length; b++) {
        //This IF statement is to check if the value on the array is not NULL so we can avoid the NullPointerException error message.
        if (employeeList[b] != null) {
        EmployeeData employee = employeeList[b];
        System.out.println("Employee ID: " + employee.getEmpId() + "     " + "Status: " + employee.getStatus());
        System.out.print("Employee Name: " + employee.getFirstName() + employee.getLastName() + "     "); System.out.println("Total Hours Worked: " + employee.getTotalHoursWork());
        //This outputs the total employee benefits which is calculated on the EmpData class
        System.out.println("Total Employee Benefits (Rice/Clothing/Phone Allowance): " + employee.getTotalAllowance() + "     ");
        System.out.println("=====================================");
        System.out.println("Gross Earnings: " + (df.format(wSalary.getSalaryOnHoursWorked(employee.getHoursWorked(), employee.getHourlyRate()) + employee.getTotalAllowance())));
        System.out.println("=====================================");
        goBacktoMenu();
    }    
}
}

//This method pulls the net earnings of the employee, first we calculate the gross earnings and deduct the appropriate deductons, (the calculation of the total deductions
//was performed under the EmpData class)
private static void EmployeeNetEarnings() throws InterruptedException, IOException {
    //New object instancing
    EmployeeData[] employeeList = employeeModel.getEmployeeModelList();
    EmployeeHoursSalary wSalary = new EmployeeHoursSalary(); 
        System.out.println("=====================================");
        System.out.println("Employee Net Earnings Data");
        System.out.println("=====================================");
    //For loop statement used to go thru the stored csv data.
    for (int b = 0; b < employeeList.length; b++) {
        //This IF statement is to check if the value on the array is not NULL so we can avoid the NullPointerException error message.
        if (employeeList[b] != null) {
        EmployeeData employee = employeeList[b];
        System.out.println("Employee ID: " + employee.getEmpId() + "     " + "Status: " + employee.getStatus());
        System.out.print("Employee Name: " + employee.getFirstName() + employee.getLastName() + "     "); System.out.println("Total Hours Worked: " + employee.getTotalHoursWork());
        System.out.println("=====================================");
        //This outputs the total employee benefits which is calculated on the EmpData class
        System.out.println("Total Employee Benefits (Rice/Clothing/Phone Allowance): " + employee.getTotalAllowance() + "     ");
        //This outputs the total employee deductions which is calculated on the EmpData class
        System.out.println("Total Employee Deductions (SSS/PAG-IBIG/PHIL HEALTH/WITHOLDING TAX): " + employee.getTotalDeduction() + "     ");
        System.out.println("Gross Earnings: " + (df.format(wSalary.getSalaryOnHoursWorked(employee.getHoursWorked(), employee.getHourlyRate()))));
        System.out.println("=====================================");
        System.out.println("Net Earnings: " + (df.format(wSalary.getSalaryOnHoursWorked(employee.getHoursWorked(), employee.getHourlyRate())- employee.getTotalDeduction())));
        System.out.println("=====================================");
        goBacktoMenu();
    }
}
}
//This selection is used to go back to the main menu without re-running the program
private static void goBacktoMenu() throws InterruptedException, IOException {
        System.out.println("Do you want to go back to the main menu? yes or no?");
        System.out.println("=====================================");
        Scanner sel = new Scanner(System.in);
            Thread.sleep(1000);
        String gmenu = sel.nextLine();
        goSelect(gmenu);
        sel.close();
}

private static void goSelect(String gmenu) throws InterruptedException, IOException {
    switch (gmenu) {
        case "yes":
            menuSelect();
            break;
        case "no":
            System.out.println("Thank you for using the MotorPH Payroll portal..");
            break;
        default:
            break;
    }
}

}
