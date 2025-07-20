public class Ex314 {
  private int month;
  private int day;
  private int year;

  public Ex314() {
    // do nothing
  } // close Ex314
  public Ex314(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
  } // close constructor

  public int getMonth() {
    return month;
  } // close getMonth
  public int getDay() {
    return day;
  } // close getDay
  public int getYear() {
    return year;
  } // close getYear

public void setMonth(int month) {
  this.month = month;
} // close setMonth
public void setDay(int day) {
  this.day = day;
} // close setDay
public void setYear(int year) {
  this.year = year;
} // close setYear
public void displayDate() {
  System.out.printf("%d/%d/%d%n", month, day, year);
} // close displayDate

} // class