
package Models;
/**
 * 
 * @author Vimantha_Dilshan
 */
public class Jobs {
    private String JobID;
    private String RepairCategory;
    private String VehicleType;
    private String EmpName;
    private String CustomerName;
    private String CustomerTelephone;
    private String CustomerAddress;
    private String VehicleNo;
    private String RDate;
    private double RCharge;

    public Jobs(String JobID, String RepairCategory, String VehicleType) {
        this.JobID = JobID;
        this.RepairCategory = RepairCategory;
        this.VehicleType = VehicleType;
    }

    public Jobs(String EmpName, String CustomerName, String CustomerTelephone, String VehicleNo, String RDate, double RCharge) {
        this.EmpName = EmpName;
        this.CustomerName = CustomerName;
        this.CustomerTelephone = CustomerTelephone;
        this.VehicleNo = VehicleNo;
        this.RDate = RDate;
        this.RCharge = RCharge;
    }

    public double getRCharge() {
        return RCharge;
    }

    public void setRCharge(double RCharge) {
        this.RCharge = RCharge;
    }

    public String getJobID() {
        return JobID;
    }

    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    public String getRepairCategory() {
        return RepairCategory;
    }

    public void setRepairCategory(String RepairCategory) {
        this.RepairCategory = RepairCategory;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerTelephone() {
        return CustomerTelephone;
    }

    public void setCustomerTelephone(String CustomerTelephone) {
        this.CustomerTelephone = CustomerTelephone;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String VehicleNo) {
        this.VehicleNo = VehicleNo;
    }

    public String getRDate() {
        return RDate;
    }

    public void setRDate(String RDate) {
        this.RDate = RDate;
    }
    
    
}
