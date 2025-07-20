import java.util.Scanner;

public class Ex418Test {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your account number? ");
      int accountNumber = input.nextInt();
    System.out.print("What is your balance? ");
      int beginningBalance = input.nextInt();
    System.out.print("How much is your total charges? ");
      int totalCharges = input.nextInt();
    System.out.print("How much is your total credits? ");
      int totalCredits = input.nextInt();
    System.out.print("What is your credit limit? ");
      int creditLimit = input.nextInt();
  
    Ex418 customer1 = new Ex418(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);

    System.out.printf("Your new balance is: $%d%n", customer1.calculateNewBalance());
      if (customer1.isCreditExceeded()) {
        System.out.println("Sorry, your credit limit is exceeded");
      } // close if

    input.close();

  } // close main

} // close class