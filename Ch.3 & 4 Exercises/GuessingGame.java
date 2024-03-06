// This program generates a random number from 1-10 and then has the user try to
// guess the number
// Kevin Pulikkottil
// 8/8/22
// JDK 14.0.1

import javax.swing.JOptionPane;

public class GuessingGame {
  public static void main(String[] args) {
    // generating a random number from 1-10
    int computerNumber = (int)(Math.random() * 10 + 1);
    // displaying the correct guess for testing purposes
    System.out.println("The correct guess would be " + computerNumber);
    int userAnswer = 0;
    int count = 0;
    while (computerNumber != userAnswer) {
      count++;
      String response =
          JOptionPane.showInputDialog(null, "Enter a guess between 1 and 10");
      // converting the string response into an integer
      userAnswer = Integer.parseInt(response);
      String result = null;
      // testing whether the inputted value is valid, correct, and/or too high
      // or low
      if (computerNumber == userAnswer) {
        result = "correct";
      } else {
        if (userAnswer <= 0 || userAnswer > 10) {
          result = "Invalid guess";
        } else if (userAnswer > computerNumber) {
          result = "Too High";
        } else {
          result = "Too Low";
        }
      }
      JOptionPane.showMessageDialog(null, result + "\nTry number " + count);
    }
    // displaying messages that tell the user how well they did
    if (count == 1) {
      JOptionPane.showMessageDialog(null, "You must be psychic!");
    } else if (count < 3) {
      JOptionPane.showMessageDialog(null, "Amazing!");
    } else if (count < 5) {
      JOptionPane.showMessageDialog(null, "Great Job!");
    } else {
      JOptionPane.showMessageDialog(null, "You need some practice");
    }
  }
}
