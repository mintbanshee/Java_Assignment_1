public class Ex418 {
  private int accountNumber;
  private int beginningBalance;
  private int totalCharges;
  private int totalCredits;
  private int creditLimit;

  public Ex418() {
    // do nothing
  } // Ex418
  public Ex418(int accountNumber, int beginningBlance, int totalCharges, int totalCredits, int creditLimit) {
    this.accountNumber = accountNumber;
    this.beginningBalance = beginningBlance;
    this.totalCharges = totalCharges;
    this.totalCredits = totalCredits;
    this.creditLimit = creditLimit;
  } // close constructor

  public int getAccountNumber() {
    return accountNumber;
  }
  public int getBeginningBalance() {
    return beginningBalance;
  }
  public int getTotalCharges() {
    return totalCharges;
  }
  public int getTotalCredits() {
    return totalCredits;
  }
  public int getCreditLimit() {
    return creditLimit;
  }
  public int calculateNewBalance() {
    return beginningBalance + totalCharges - totalCredits;
  }
  public boolean isCreditExceeded() {
    return calculateNewBalance() > creditLimit;
  }
// close methods
} // close class