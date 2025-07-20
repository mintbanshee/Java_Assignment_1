import java.util.Scanner;

public class Ex420Test {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("How many hours did you work? ");
    double hoursWorked = input.nextDouble();
  System.out.print("What is your hourly wage? ");
    double hourlyWage = input.nextDouble();

  Ex420 employee = new Ex420(hoursWorked, hourlyWage);
  
  System.out.printf("Your gross pay is $%.2f%n", employee.calculateGrossPay());

  input.close();
  
  } // close main
} // close class