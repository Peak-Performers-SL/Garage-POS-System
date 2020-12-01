
package Models;

/**
 * 
 * @author Vimantha_Dilshan
 */
public class Report {
    private double Income;
    private double AmountPay;

    public Report(double Income, double AmountPay) {
        this.Income = Income;
        this.AmountPay = AmountPay;
    }

    public double getAmountPay() {
        return AmountPay;
    }

    public void setAmountPay(double AmountPay) {
        this.AmountPay = AmountPay;
    }

    public double getIncome() {
        return Income;
    }

    public void setIncome(double Income) {
        this.Income = Income;
    }
    
    
}
