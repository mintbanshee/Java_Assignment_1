import java.util.Scanner;

public class Ex419Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

Ex419 salesPerson = new Ex419(200.00, 0.09);


salesPerson.addSale(239.99); // item1
salesPerson.addSale(129.75); // item2
salesPerson.addSale(99.95); // item3
salesPerson.addSale(350.89); // item4

System.out.printf("Total Sales: $%.2f%n", salesPerson.getTotalSales());
System.out.printf("Total Earnings: $%.2f%n", salesPerson.calculateEarnings());



input.close();

  } // close main
} // close class