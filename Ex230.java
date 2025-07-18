public class Ex230 {
  
  private int number;

  public Ex230() {
    //do nothing
  } // close constructor

  public Ex230(int number) {
    this.number = number;
  } // constructor

  public int getNumber() {
    return number;
  } // getNumber

  public String getSeparatedDigits() {
    int number1 = number;

      int digit1 = number1 / 10000;
      int digit2 = (number1 / 1000) % 10;
      int digit3 = (number1 / 100) % 10;
      int digit4 = (number1 / 10) %10;
      int digit5 = number1 % 10;

      return digit1 + "  " + digit2 + "  " + digit3 + "  " + digit4 + "  " + digit5 + "  ";
  } // getSeparatedDigits

  public void setNumber(int number) {
    this.number = number;
  } // setNumber

} // class