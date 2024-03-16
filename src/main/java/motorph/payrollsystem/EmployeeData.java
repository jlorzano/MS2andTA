/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph.payrollsystem;

/**
 *
 * @author gamer
 */
public class EmployeeData {
    
    private String empID;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String status;
    private String position;
    private double riceSubsidy;
    private double clothingAllowance;
    private double phoneAllowance;
    private double sssDeduction;
    private double pagibigDeduction;
    private double philhealthDeduction;
    private double witholdingTax;
    private double hourlyRate;
    private double hoursWorked;
    private double totalDeduction;
    private double weekOne;
    private double weekTwo;
    private double weekThree;
    private double weekFour;
    private double totalWorkHours;
    private double totalAllowance;
    
    public String getEmpId() {
        return empID;
    }
    public void setEmpId(String empID) {
        this.empID = empID;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getRiceSubsidy() {
        return riceSubsidy;
    }
    public void setRiceSubsidy(double riceSubsidy) {
        this.riceSubsidy = riceSubsidy;
    }
    public double getClothingAllowance() {
        return clothingAllowance;
    }
    public void setClothingAllowance(double clothingAllowance) {
        this.clothingAllowance = clothingAllowance;
    }
    public double getPhoneAllowance() {
        return phoneAllowance;
    }
    public void setPhoneAllowance(double phoneAllowance) {
        this.phoneAllowance = phoneAllowance;
    }
    public double getSssDeduction() {
        return sssDeduction;
    }
    public void setSssDeduction(double sssDeduction) {
        this.sssDeduction = sssDeduction;
    }
    public double getPagibigDeduction() {
        return pagibigDeduction;
    }
    public void setPagibigDeduction(double pagibigDeduction) {
        this.pagibigDeduction = pagibigDeduction;
    }
    public double getPhilhealthDeduction() {
        return philhealthDeduction;
    }
    public void setPhilhealthDeduction(double philhealthDeduction) {
        this.philhealthDeduction = philhealthDeduction;
    }
    public double getWitholdingTax() {
        return witholdingTax;
    }
    public void setWitholdingTax(double witholdingTax) {
        this.witholdingTax = witholdingTax;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getWeekOne() {
        return weekOne;
    }
    public void setWeekOne(double weekOne) {
        this.weekOne = weekOne;
    }
    public double getWeekTwo() {
        return weekTwo;
    }
    public void setWeekTwo(double weekTwo) {
        this.weekTwo = weekTwo;
    }
    public double getWeekThree() {
        return weekThree;
    }
    public void setWeekThree(double weekThree) {
        this.weekThree = weekThree;
    }
    public double getWeekFour() {
        return weekFour;
    }
    public void setWeekFour(double weekFour) {
        this.weekFour = weekFour;
    }
    //We set the values of the deductions from the bufferedreader.
    public void setTotalDeduction(double sssDeduction, double pagibigDeduction, double philhealthDeduction, double witholdingTax) {
        this.sssDeduction = sssDeduction;
        this.pagibigDeduction =  pagibigDeduction;
        this.philhealthDeduction = philhealthDeduction;
        this.witholdingTax = witholdingTax;
    }
    //This is where we calculate the total deductions by adding the four types of deductions and then calling this "getter" on the main method and deduct it from the gross earnings.
    public double getTotalDeduction() {
        totalDeduction = sssDeduction + pagibigDeduction + philhealthDeduction + witholdingTax;
        return totalDeduction;
    }
    public void setTotalHoursWork (double weekOne, double weekTwo, double weekThree, double weekFour) {
        this.weekOne = weekOne;
        this.weekTwo = weekTwo;
        this.weekThree = weekThree;
        this.weekFour = weekFour;
    }
    public double getTotalHoursWork () {
        totalWorkHours = weekOne + weekTwo + weekThree + weekFour;
        return totalWorkHours;
    }
    public void setTotalAllowance (double riceSubsidy, double clothingAllowance, double phoneAllowance) {
        this.riceSubsidy = riceSubsidy;
        this.clothingAllowance = clothingAllowance;
        this.phoneAllowance = phoneAllowance;
    }
    public double getTotalAllowance () {
        totalAllowance = riceSubsidy + clothingAllowance + phoneAllowance;
        return totalAllowance;
    }
}
