import java.util.Scanner;
// Create a MonthCreator class
public class MonthCreator {
  // Main method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first month number (1-12): ");
    // Create an object month1
    Month month1 = new Month(input.nextInt());

    // Print month1 object
    System.out.println(month1);

    System.out.println("Enter the second month number (1-12): ");
    // Create an object month2
    Month month2 = new Month(input.nextInt());

    // Print month2 object
    System.out.println(month2);

    // Call method equals() to check month1 and month2 is equal
    // If both are equal
    if (month1.equals(month2))

      System.out.println(month1.getMonthName() + " is equal to " +
                         month2.getMonthName());

    // If both are different
    else

      System.out.println(month1.getMonthName() + " is not equal to " +
                         month2.getMonthName());
  }
}
