public class Ex313Test {
  public static void main(String[] args) {
    
    Ex313 employee1 = new Ex313("Jane", "Green", 3000.00);
    Ex313 employee2 = new Ex313("John", "Blue", 2800.00);

    // before raise
    System.out.printf("%s %s's yearly salary is $%.2f%n",
      employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());

     System.out.printf("%s %s's yearly salary is $%.2f%n",
      employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

      // apply raise
      employee1.applyRaise();
      employee2.applyRaise();

    // after their raise
    System.out.printf("After giving %s %s her raise, her new salary is $%.2f%n",
      employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
    System.out.printf("After giving %s %s his raise, his new salary is $%.2f%n",
      employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

  } // close main

} // close class