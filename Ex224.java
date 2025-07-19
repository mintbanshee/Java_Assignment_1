public class Ex224 {
  private int number1;
  private int number2;
  private int number3;
  private int number4;
  private int number5;

  public Ex224(int number1, int number2, int number3, int number4, int number5) {
    this.number1 = number1;
    this.number2 = number2;
    this.number3 = number3;
    this.number4 = number4;
    this.number5 = number5;
  } // close constructor

  public int getNumber1() {
    return number1;
  } // getNumber1
  public int getNumber2() {
    return number2;
  } // getNumber2
  public int getNumber3() {
    return number3;
  } // getNumber3
  public int getNumber4() {
      return number4;
  } // getNumber4
  public int getNumber5() {
    return number5;
  } // getNumber5

  public String getResult() {
    int smallest = number1;
    int largest = number1;

      if (number2 < smallest) {
        smallest = number2;
      }

      if (number3 < smallest) {
        smallest = number3;
      }

      if (number4 < smallest) {
        smallest = number4;
      }

      if (number5 < smallest) {
        smallest = number5;
      }

      if (number2 > largest) {
        largest = number2;
      }

      if (number3 > largest) {
        largest = number3;
      }

      if (number4 > largest) {
        largest = number4;
      }

      if (number5 > largest) {
        largest = number5;
      }

    return "Smallest: " + smallest + "\nLargest: " + largest;
  } // getResult


  public void setNumber1(int number1) {
    this.number1 = number1;
  } // close setNumber1

} // close class