public class Ex440Test {
  public static void main(String[] args) {

  double currentPopulation = 8_100_000_000.0;
  double growthRate = 0.0105;

  for (int year = 1; year <= 75; year++) {
    double increase = currentPopulation * growthRate;
    double newPopulation = currentPopulation + increase;

    System.out.printf("Year %2d: Population = %.0f | Increase = %.2f%n", year, newPopulation, increase);
    currentPopulation = newPopulation;
  } // loop

  } // close main
} // close class


// Written answer for last part of question
// at the current rate of growth, year 67 we would double our current population.