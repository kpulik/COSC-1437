// Coin toss
// Kevin Pulikkottil
// 9/8/22
// JDK 14.0.1

import java.util.Scanner;

public class HeadsTails {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many times would you like to flip the coin?");
    int times = input.nextInt();
    int headCounter = 0;
    int tailCounter = 0;
    for (int i = 0; i < times; i++) {
      double r = Math.random();
      if (r >= 0.5) {
        headCounter++;
        System.out.println("Heads");
      } else {
        tailCounter++;
        System.out.println("Tails");
      }
    }
    System.out.println("Number of heads: " + headCounter +
                       "\nNumber of tails: " + tailCounter);
  }
}
