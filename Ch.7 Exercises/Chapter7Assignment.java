// Chapter7Assignment
// Kevin Pulikkottil
// 10/9/22
// JDK version 14.0.1

import java.util.Scanner;
public class Chapter7Assignment {
  public static void main(String[] args) {
    // creating the variables
    int numSodas = 0;
    int totalSold = 0;
    String highestSoda = "";
    String lowestSoda = "";
    Scanner input = new Scanner(System.in);
    System.out.print("How many types of soda would you like to enter: ");
    numSodas = input.nextInt();
    while (numSodas < 0) {
      input = new Scanner(System.in);
      System.out.print("How many types of soda would you like to enter: ");
      numSodas = input.nextInt();
    }
    int[] sodaSold = new int[numSodas];
    String[] sodaName = new String[numSodas];
    // looping through the array
    for (int i = 0; i < numSodas; i++) {
      input = new Scanner(System.in);
      System.out.print("Enter the name of soda type " + (i + 1) + ": ");
      sodaName[i] = input.nextLine();
    }
    // Loop through the array
    for (int i = 0; i < numSodas; i++) {
      input = new Scanner(System.in);
      System.out.print("Enter the number of " + sodaName[i] +
                       " bottles sold: ");
      sodaSold[i] = input.nextInt();
      while (sodaSold[i] < 0) {
        input = new Scanner(System.in);
        System.out.print("Enter the number of " + sodaName[i] +
                         " bottles sold: ");
        sodaSold[i] = input.nextInt();
      }
      totalSold += sodaSold[i];
    }
    // looping through the array to find the highest and lowest selling
    // soda
    int highestSold = sodaSold[0];
    int lowestSold = sodaSold[0];
    for (int i = 0; i < numSodas; i++) {
      if (sodaSold[i] > highestSold) {
        highestSoda = sodaName[i];
        highestSold = sodaSold[i];
      }
      if (sodaSold[i] < lowestSold) {
        lowestSoda = sodaName[i];
        lowestSold = sodaSold[i];
      }
    }
    // displaying the total sales and the names of the highest selling and
    // lowest selling sodas
    System.out.println("---------------------------------");
    System.out.println("Total Sold: " + totalSold);
    System.out.println("Highest Sold: " + highestSoda);
    System.out.println("Lowest Sold: " + lowestSoda);
  }
}
