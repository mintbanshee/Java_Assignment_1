public class Ex440 {
  private double currentPopulation;
  private double growthRate;


public Ex440 () {
  // do nothing
}
public Ex440 (double currentPopulation, double growthRate) {
  this.currentPopulation = currentPopulation;
  this.growthRate = growthRate;
}
public double growPopulation() {
  double newPopulation = currentPopulation + (currentPopulation * growthRate);
  currentPopulation = newPopulation;
  return newPopulation;
}

public double getNewPopulation() {
  return currentPopulation + (currentPopulation * growthRate);
}

} // close classa