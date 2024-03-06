// Kevin Pulikkottil
// 09/4/2022
// JDK 14.0.1
// a program that takes in data from the user, writes equations, and outputs the
// results.

import java.util.Scanner;
public class UserInput {
  public static void main(String args[]) {
    // creating a scanner called input
    Scanner input = new Scanner(System.in);

    // getting the values from the user
    System.out.println("Name: ");
    String name = input.nextLine();
    System.out.println("Enter a number: ");
    int num1 = input.nextInt();
    System.out.println("Enter another number: ");
    int num2 = input.nextInt();
    System.out.println("Enter another number: ");
    int num3 = input.nextInt();

    // calculations
    double result = ((double)num1 / num2) + num3;

    // outputting the results
    System.out.println(num1 + " / " + num2 + " + " + num3 + " = " + result);
  }
}
