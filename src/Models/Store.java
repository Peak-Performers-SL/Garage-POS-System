
package Models;
/**
 * 
 * @author Vimantha_Dilshan
 */
public class Store {
    private String PartID;
    private String PartName;
    private String PartBrand;
    private String PartManufacture;
    private String PartDescription;
    private String PartPrice;
    private String SupplierID;

    public Store(String PartID, String PartName, String PartBrand, String PartManufacture, String PartDescription, String PartPrice) {
        this.PartID = PartID;
        this.PartName = PartName;
        this.PartBrand = PartBrand;
        this.PartManufacture = PartManufacture;
        this.PartDescription = PartDescription;
        this.PartPrice = PartPrice;
    }

    public Store(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getPartID() {
        return PartID;
    }

    public void setPartID(String PartID) {
        this.PartID = PartID;
    }

    public String getPartName() {
        return PartName;
    }

    public void setPartName(String PartName) {
        this.PartName = PartName;
    }

    public String getPartBrand() {
        return PartBrand;
    }

    public void setPartBrand(String PartBrand) {
        this.PartBrand = PartBrand;
    }

    public String getPartManufacture() {
        return PartManufacture;
    }

    public void setPartManufacture(String PartManufacture) {
        this.PartManufacture = PartManufacture;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public void setPartDescription(String PartDescription) {
        this.PartDescription = PartDescription;
    }

    public String getPartPrice() {
        return PartPrice;
    }

    public void setPartPrice(String PartPrice) {
        this.PartPrice = PartPrice;
    }
    
    
}
