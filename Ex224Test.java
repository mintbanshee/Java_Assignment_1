import java.util.Scanner;

public class Ex224Test {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("What is your first number?");
    int number1 = input.nextInt();
  System.out.print("What is your second number?");
    int number2 = input.nextInt();
  System.out.print("What is your third number?");
    int number3 = input.nextInt();
  System.out.print("What is your fourth number?");
    int number4 = input.nextInt();
  System.out.print("What is your fifth number?");
    int number5 = input.nextInt();

  Ex224 numbers = new Ex224(number1, number2, number3, number4, number5);

  System.out.println(numbers.getResult());

input.close();
  } // main()
} // class