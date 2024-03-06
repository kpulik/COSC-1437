// MethodsGame
// Kevin Pulikkottil 9/17/22
// JDK 14.0.1

import java.util.Random;
import java.util.Scanner;
public class MethodsGame {
  public static void main(String[] args) {
    // creating the scanner and random number generator
    Scanner input = new Scanner(System.in);
    Random randNum = new Random();

    // making the game replayable if the user chooses to do so
    String playAgain = "yes";
    while (playAgain.equalsIgnoreCase("yes")) {
      // randomly selecting the questions
      int x = (int)(Math.random() * 10 + 1);
      // initializing the variable
      String questionAns = "neutral";
      // assigning the output of the switchAnimal method to the variable
      // the switchAnimal method asks the user a question and returns whether
      // the answer to the question is right or wrong
      questionAns = switchAnimal(x, questionAns);
      // asking the user for their response
      System.out.println("True or False?");
      String userAns = input.nextLine();
      // method to compare the user's answer to the correct answer
      Compare(userAns, questionAns);
      // asking the user if they would like to play again
      System.out.println("Would you like to play again? (yes or no)");
      playAgain = input.nextLine();
    }
  }

  public static String switchAnimal(int x, String questionAns) {
    // asking the user a question based on the randomly generated number
    switch (x) {
    case 1:
      System.out.println("No cat likes water.");
      questionAns = "false";
      break;
    case 2:
      System.out.println("Frogs have to drink lots of water.");
      questionAns = "false";
      break;
    case 3:
      System.out.println("Chimpanzees are nocturnal");
      questionAns = "false";
      break;
    case 4:
      System.out.println("Ostriches bury their head in the sand.");
      questionAns = "false";
      break;
    case 5:
      System.out.println("Touching a toad can give you warts.");
      questionAns = "false";
      break;
    case 6:
      System.out.println(
          "The hummingbird egg is the world's smallest bird egg.");
      questionAns = "true";
      break;
    case 7:
      System.out.println("Camels can walk 100 miles in the sand without water");
      questionAns = "true";
      break;
    case 8:
      System.out.println("Elephants eat with their noses.");
      questionAns = "true";
      break;
    case 9:
      System.out.println("Some animals can get sunburned.");
      questionAns = "true";
      break;
    case 10:
      System.out.println("Dalmatians are born without spots.");
      questionAns = "true";
      break;
    }
    // returning the correct answer to the question
    return questionAns;
  }

  public static void Compare(String userAns, String questionAns) {
    // comparing the user's answer to the correct answer and displaying whether
    // the user got the right answer or not
    if (userAns.equalsIgnoreCase(questionAns)) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }
  }
}
