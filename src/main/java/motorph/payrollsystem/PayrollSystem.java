/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package motorph.payrollsystem;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gamer
 */
public class PayrollSystem {

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
        default:
            break;
    }
}
private static void getDefaultEmployeeModel() throws IOException {
        empModel = new BufferedData() {};
}

private static void EmployeeInformation() throws IOException {
    EmpData[] emps = empModel.getEmployeeModelList();
    System.out.println("=======================");
    System.out.println(" Employee Information ");
    System.out.println("=======================");
    System.out.println("emps.length " + emps.length);
    for (int a = 0; a < emps.length; a++) {
    EmpData empx = emps[a];
    System.out.print("Employee ID: " + empx.getEmpId() + "\n");
}
}
}
