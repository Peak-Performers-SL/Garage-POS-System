
package Models;
/**
 * 
 * @author Vimantha_Dilshan
 */
public class Employee {
    private String EmpID;
    private String EmpName;
    private int EmpAge;
    private String EmpAddress;
    private String EmpTelephone;
    private String EmpEmail;
    private double BasicSalary;
    private double HourlyCharge;

    public Employee(String EmpID, String EmpName, int EmpAge, String EmpAddress, String EmpTelephone, String EmpEmail, double BasicSalary, double HourlyCharge) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpAge = EmpAge;
        this.EmpAddress = EmpAddress;
        this.EmpTelephone = EmpTelephone;
        this.EmpEmail = EmpEmail;
        this.BasicSalary = BasicSalary;
        this.HourlyCharge = HourlyCharge;
    }

    public double getHourlyCharge() {
        return HourlyCharge;
    }

    public void setHourlyCharge(double HourlyCharge) {
        this.HourlyCharge = HourlyCharge;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int EmpAge) {
        this.EmpAge = EmpAge;
    }

    public String getEmpAddress() {
        return EmpAddress;
    }

    public void setEmpAddress(String EmpAddress) {
        this.EmpAddress = EmpAddress;
    }

    public String getEmpTelephone() {
        return EmpTelephone;
    }

    public void setEmpTelephone(String EmpTelephone) {
        this.EmpTelephone = EmpTelephone;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String EmpEmail) {
        this.EmpEmail = EmpEmail;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }
    
    
}
