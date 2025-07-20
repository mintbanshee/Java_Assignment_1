public class Ex313 {
  private String firstName;
  private String lastName;
  private double monthlySalary;

  public Ex313() {
    // do nothing
  } // close constructor
  public Ex313(String firstName, String lastName, double monthlySalary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.monthlySalary = monthlySalary;
  } // close constructor

  public String getFirstName() {
    return firstName;
  } // close getFirstName
  public String getLastName() {
    return lastName;
  } // close getLastName
  public double getMonthlySalary() {
    return monthlySalary;
  } // close getMonthlySalary
  public double getYearlySalary() {
    return (monthlySalary * 12);
  } // close getYearlySalary

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  } // close setFirstName
  public void setLastName(String lastName) {
    this.lastName = lastName;
  } // close setLastName
  public void setMonthlySalary(double monthlySalary) {
    if (monthlySalary > 0) {
      this.monthlySalary = monthlySalary;
    } // close if
  } // close setMonthlySalary
  public void applyRaise() {
    monthlySalary = monthlySalary * 1.10;
  } // close setApplyRaise

} // close class