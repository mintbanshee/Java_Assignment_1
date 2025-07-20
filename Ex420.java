public class Ex420 {
  private double hoursWorked;
  private double hourlyWage;

  public Ex420() {
    // do nothing
  }
  public Ex420(double hoursWorked, double hourlyWage) {
    this.hoursWorked = hoursWorked;
    this.hourlyWage = hourlyWage;
  } // close constructor

public double getHoursWorked() {
  return hoursWorked;
} // close getter
public double getHourlyWage() {
  return hourlyWage;
} // close getter

public void setHoursWorked(double hoursWorked) {
  this.hoursWorked = hoursWorked;
} // close setter
public void setHourlyWage(double hourlyWage) {
  this.hourlyWage = hourlyWage;
} // close setter

public double calculateGrossPay() {
  if (hoursWorked <= 40) {
    return hoursWorked * hourlyWage;
  } // close if
    else {
      double overtimeHours = hoursWorked - 40;
      return (40 * hourlyWage) + (overtimeHours * hourlyWage * 1.5);
    } // close else
  } // close calculate
} // close class 