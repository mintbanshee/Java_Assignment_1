public class Ex419 {
  private double basePay;
  private double commissionRate;
  private double totalSales;

  public Ex419() {
    // do nothing
  }
  public Ex419(double basePay, double commissionRate) {
    this.basePay = basePay;
    this.commissionRate = commissionRate;
    this.totalSales = 0;
  } // close constructor

  public void addSale(double price) {
    totalSales += price;
  } // close addSale

  public double calculateEarnings() {
    return basePay + (totalSales * commissionRate);
  } // close calculateEarnings

  public double getTotalSales() {
    return totalSales;
  } // close getTotalSales
} // close class