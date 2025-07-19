public class Ex312 {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;

  public Ex312() {
    //do nothing
  } // close constructor
  public Ex312(String partNumber, String partDescription, int quantity, double pricePerItem) {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.quantity = quantity;
    this.pricePerItem = pricePerItem;
  } // close constructor

  public String getPartNumber() {
    return partNumber;
  } // close getPartNumber
  public String getPartDescription() {
    return partDescription;
  } // close getPartDescription
  public int getQuantity() {
    if (quantity < 0) {
      return 0;
    } // close if
      else {
        return quantity;
      } // close else
  } // close getQuantity
  public double getPricePerItem() {
    if (pricePerItem < 0) {
      return 0.0;
    } // close if
      else {
        return pricePerItem;
      } // close else
    } // getPricePerItem
    public double getInvoiceAmount() {
      return (getQuantity() * getPricePerItem());
    } // close getInvoiceAmount

    public void setPartNumber(String partNumber) {
      this.partNumber = partNumber;
    } // close setPartNumber
    public void setPartDescription(String partDescription) {
      this.partDescription = partDescription;
    } // close setPartDescription
    public void setQuantity(int quantity) {
      this.quantity = quantity;
    } // close setQuantity
    public void setPricePerItem(double pricePerItem) {
      this.pricePerItem = pricePerItem;
    } // close setPricePerItem


  } // close class