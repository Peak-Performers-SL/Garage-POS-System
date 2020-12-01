
package Models;
/**
 * 
 * @author Vimantha_Dilshan
 */
public class Suppliers {
    private String SupplierID;
    private String SupplierName;
    private String SupplierAddress;
    private String SupplierEmail;
    private String SupplierTelephone;

    public Suppliers(String SupplierID, String SupplierName, String SupplierAddress, String SupplierEmail, String SupplierTelephone) {
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.SupplierAddress = SupplierAddress;
        this.SupplierEmail = SupplierEmail;
        this.SupplierTelephone = SupplierTelephone;
    }

    public String getSupplierTelephone() {
        return SupplierTelephone;
    }

    public void setSupplierTelephone(String SupplierTelephone) {
        this.SupplierTelephone = SupplierTelephone;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getSupplierAddress() {
        return SupplierAddress;
    }

    public void setSupplierAddress(String SupplierAddress) {
        this.SupplierAddress = SupplierAddress;
    }

    public String getSupplierEmail() {
        return SupplierEmail;
    }

    public void setSupplierEmail(String SupplierEmail) {
        this.SupplierEmail = SupplierEmail;
    }
    
    
}
