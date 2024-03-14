/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph.payrollsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gamer
 */
public class BufferedData extends EmpModel {
    
    public BufferedData () throws IOException {
        String path = "C:\\Users\\gamer\\OneDrive\\Documents\\Mmdc\\MotorPH Employee Datav4.txt";
           empData = new EmpData[35];
           getData(path);
}
    @Override
    public EmpData[] getEmployeeModelList() {
        return empData;
    }
    private void getData(String path) throws FileNotFoundException, IOException {
        int maxAttempts = 3;
        int attempts = 0;
        boolean cont = true;
        while (cont) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.print("Enter Employee ID: ");
        String lookup = scan.nextLine();
        attempts++;
        if (attempts==maxAttempts) { System.out.println("You have reached the max attempt!"); break; }
                      
        BufferedReader br = new BufferedReader(new FileReader(path));
        boolean found = false;
        int counter = 0;
        while ((str = br.readLine()) != null) {
            if (str.contains(lookup)) { 
                String[] values = str.split(",");
                System.out.println("test output");
                EmpData emps = new EmpData();
                emps.setEmpId(values[0]);
                emps.setFirstName(values[2]);
                emps.setLastName(values[1]);
                emps.setBirthday(values[3]);
                emps.setAddress(values[4]);
                emps.setStatus(values[10]);
                emps.setPosition(values[11]);
                emps.setHourlyRate(Double.parseDouble(values[18]));
                emps.setRiceSubsidy(Double.parseDouble(values[14]));
                emps.setClothingAllowance(Double.parseDouble(values[16]));
                emps.setPhoneAllowance(Double.parseDouble(values[15]));
                emps.setSssDeduction(Double.parseDouble(values[25]));
                emps.setPagibigDeduction(Double.parseDouble(values[28]));
                emps.setPhilhealthDeduction(Double.parseDouble(values[26]));
                emps.setWitholdingTax(Double.parseDouble(values[27]));
                empData[counter] = emps;
                counter++;
                found = true;
                break;
            }
        }
        if(!found) {
                System.out.println("Invalid Employee ID...");
            }
        cont = !found;
    }
}

    
}    

