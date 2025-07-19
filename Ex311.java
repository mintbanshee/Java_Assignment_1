public class Ex311 {
  private String name;
  private double balance;

  public Ex311(String name, double balance) {
    this.name = name;
    this.balance = balance;
  } // close constructor

  public String getName() {
    return name;
  } // close getName
  public double getBalance() {
    return balance;
  } // close getBalance

  public void withdraw (double amount) {
    if (amount > balance) {
      System.out.println("Withdrawal amount exceeds account balance.");
    } // close if
      else {
        balance -= amount;
      } // else
  } // close withdraw
  
  public void setName(String name){
    this.name = name;
  } // close setName
  
} // close class






