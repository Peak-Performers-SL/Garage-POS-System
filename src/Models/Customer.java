
package Models;
/**
 * 
 * @author Vimantha_Dilshan
 */
public class Customer {
    private String CustomerName;
    private String CustomerTelephone;
    private String CustomerAddress;
    private String VehicleNo;
    private String VehicleType;

    public Customer(String CustomerName, String CustomerTelephone, String CustomerAddress, String VehicleNo, String VehicleType) {
        this.CustomerName = CustomerName;
        this.CustomerTelephone = CustomerTelephone;
        this.CustomerAddress = CustomerAddress;
        this.VehicleNo = VehicleNo;
        this.VehicleType = VehicleType;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
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
    
    
}
