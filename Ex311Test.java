import java.util.Scanner;

  public class Ex311Test {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the amount you wish to withdraw.  ");
      double amount = input.nextDouble();
      if (amount <= 0) {
        System.out.println("We are sorry. Withdraw amounts cannot be less than $0.");
      }

    Ex311 account1 = new Ex311 ("Jane Green", 50.00);
    Ex311 account2 = new Ex311 ("John Blue", -7.53);

    System.out.println("Which account do you wish to withdraw from? Please press \n1 for Jane \n2 for John");
      int choice = input.nextInt();
        if (choice == 1) {
          account1.withdraw(amount);
          System.out.printf("Congratulations %s, your withdrawal was successful! Your new balance is %.2f%n", account1.getName(), account1.getBalance());
        } // choice 1
          else if (choice == 2) {
          account2.withdraw(amount);
          } // choice 2
            else {
              System.out.println("Sorry, this choice is invalid. Goodbye.");
            } // invalid
    

  input.close();
    } // close main

  } // close class