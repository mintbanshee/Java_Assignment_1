import java.util.Scanner;

public class Ex436Test {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("What is the value of side 1? ");
    double side1 = input.nextDouble();
  System.out.print("What is the value of side 2? ");
    double side2 = input.nextDouble();
  System.out.print("What is the value of side 3? ");
    double side3 = input.nextDouble();

    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
      System.out.println("Yes! They can make a triangle!");
    } // close if
      else {
        System.out.println("Sorry, these do not form a triangle.");
      } // close else
  input.close();
  } // close main
} // close class