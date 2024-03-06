// Math Quiz
// Kevin Pulikkottil
// 9/11/22
// JDK 14.0.1

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // creating a scanner
    Random randNum = new Random(); // creating a random number generator

    // getting the number of questions the user wants to do
    System.out.println("How many questions would you like to solve?\t");
    int questionAmt = input.nextInt();

    // creating randomly generated multiplication questions
    int i = 1;
    int wrongAns = 0;
    int rightAns = 0;
    while (i <= questionAmt) {
      int x = randNum.nextInt(20);
      int y = randNum.nextInt(20);
      int result = x * y;

      System.out.print(x + " * " + y + " = ?\t");

      int userAns = input.nextInt();

      // displaying whether the user's answers are correct or not
      if (userAns != result) {
        System.out.println("Incorrect");
        wrongAns++;
      } else if (userAns == result) {
        System.out.println("Correct");
        rightAns++;
      }
      i++;
    }

    // calculating the user's final score and displaying it
    double score = 100 * (rightAns / questionAmt);
    System.out.println("Your score is: " + score + "%\n");

    // based on the user's score, the following messages will be displayed
    if (score >= 90) {
      System.out.println("Great job!");
    } else if (score >= 80 && score < 90) {
      System.out.println("Good job!");
    } else if (score >= 70 && score < 80) {
      System.out.println("You could use some practice.");
    } else if (score < 70) {
      System.out.println("Please practice your multiplication facts.");
    }
  }
}
