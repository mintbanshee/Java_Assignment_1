public class Ex216 {
  private int number1;
  private int number2;

public Ex216() {
  // do nothing
} // close constructor

public Ex216(int number1, int number2) {
  this.number1 = number1;
  this.number2 = number2;
} // constructor

public int getNumber1() {
  return number1;
} // getNumber1

public int getNumber2() {
  return number2;
} // getNumber2

public String getComparison() {
  if (number1 > number2) {
    return number1 + " is larger";
  } // if
    else if (number1 < number2) {
      return number2 + " is larger";
    } // else if
    else {
      return "These numbers are equal";
    } // else
  
} // getComparison

public void setNumber1(int number1) {
  this.number1 = number1;
} // setNumber1

public void setNumber2(int number2) {
  this.number2 = number2;
} // setNumber2
} // class