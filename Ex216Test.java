import java.util.Scanner;

public class Ex216Test {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);    
  System.out.print("What is your first number?");
    int number1 = input.nextInt();
  System.out.print("What is your second number?");
    int number2 = input.nextInt();

  Ex216 numberComparison = new Ex216(number1, number2);

  System.out.println(numberComparison.getComparison());
  
input.close();  
} //main
} // class