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
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static EmpModel empModel;
    
    public static void main(String[] args) throws InterruptedException, IOException {
        getDefaultEmployeeModel();
        menuSelect();
    }
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


private static void selectOpt(String select) throws IOException  {
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
private static void getDefaultEmployeeModel() throws IOException {
        empModel = new BufferedData() {};
}

private static void EmployeeInformation() throws IOException {
    EmpData[] empList = empModel.getEmployeeModelList();
        System.out.println("=======================");
        System.out.println(" Employee Information ");
        System.out.println("=======================");
        System.out.println("empList.length " + empList.length);
    for (int a = 0; a < empList.length; a++) {
        if (empList[a] != null) {
        EmpData employee = empList[a];
        System.out.println("Employee ID: " + employee.getEmpId() + "     " + "Status: " + employee.getStatus());
        System.out.println("Employee Name: " + employee.getFirstName() + employee.getLastName());
        System.out.println("DOB: " + employee.getBirthday() + "     " + "Position: " + employee.getPosition());
        System.out.println("Address: " + employee.getAddress());
    }
}
}

private static void EmployeeGrossEarnings() {
    EmpData[] empList = empModel.getEmployeeModelList();
    EmployeeHoursSalary wSalary = new EmployeeHoursSalary(); 
        System.out.println("=======================");
        System.out.println(" Employee Information ");
        System.out.println("=======================");
        System.out.println("empList.length " + empList.length);
    for (int b = 0; b < empList.length; b++) {
        if (empList[b] != null) {
        EmpData employee = empList[b];
        System.out.println("Employee ID: " + employee.getEmpId() + "     " + "Status: " + employee.getStatus());
        System.out.println("Employee Name: " + employee.getFirstName() + employee.getLastName());
        System.out.println("Gross Earnings: " + (df.format(wSalary.getSalaryOnHoursWorked(employee.getHoursWorked(), employee.getHourlyRate()))));
    }    
}
}

private static void EmployeeNetEarnings() {
    EmpData[] empList = empModel.getEmployeeModelList();
    EmployeeHoursSalary wSalary = new EmployeeHoursSalary(); 
        System.out.println("=======================");
        System.out.println(" Employee Information ");
        System.out.println("=======================");
        System.out.println("empList.length " + empList.length);
    for (int b = 0; b < empList.length; b++) {
        if (empList[b] != null) {
        EmpData employee = empList[b];
        System.out.println("Employee ID: " + employee.getEmpId() + "     " + "Status: " + employee.getStatus());
        System.out.println("Employee Name: " + employee.getFirstName() + employee.getLastName());
        System.out.println("Gross Earnings: " + (df.format(wSalary.getSalaryOnHoursWorked(employee.getHoursWorked(), employee.getHourlyRate()))));
        System.out.println("Net Earnings: " + (df.format(wSalary.getSalaryOnHoursWorked(employee.getHoursWorked(), employee.getHourlyRate())- employee.getTotalDeduction())));
    }
}
}
}
