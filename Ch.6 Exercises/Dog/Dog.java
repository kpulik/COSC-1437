package dogcreator;

public class Dog {

  private String name = null;
  private double weight = 0;

  public Dog(String newName, double newWeight) {
    setName(newName);
    setWeight(newWeight);
  }

  public final void setName(String newName) { this.name = newName; }

  public final void setWeight(double newWeight) {
    if (newWeight > 0) {
      this.weight = newWeight;
    } else {
      System.out.println("Weight cannot be negative or zero.");
    }
  }

  public String getName() { return this.name; }

  public double getWeight() { return this.weight; }

  public String compare(Dog dogCompare) {
    String message = null;
    if (dogCompare.weight > this.weight) {
      message = dogCompare.name + " weighs more than " + this.name;
    } else if (dogCompare.weight < this.weight) {
      message = this.name + " weighs more than " + dogCompare.name;
    } else {
      message = this.name + " weighs equal to " + dogCompare.name;
    }
    return message;
  }
}
