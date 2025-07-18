import java.util.Scanner;

public class Ex230Test {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("What is your number?");
      int number = input.nextInt();

      Ex230 number1 = new Ex230(number);

  System.out.println(number1.getSeparatedDigits());
 
  input.close();
  } // close main
} // class