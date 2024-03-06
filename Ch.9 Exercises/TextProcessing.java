// a program that takes a string input from the user and prints the reverse
import java.util.Scanner;

public class TextProcessing {
  public static void main(String[] args) {
    // creating a scanner
    Scanner keybr = new Scanner(System.in);
    String input;

    // asking the user to input a string
    System.out.print("Enter a word: ");
    input = keybr.nextLine();

    // passing the string to the reverseString method
    reverseString(input);
  }

  // method to reverse the user-inputted string
  private static void reverseString(String word) {
    System.out.print("The reverse of " + word + " is: ");
    // a for-loop to print out the letters of the string in reverse order
    for (int i = 0; i < word.length(); i++) {
      System.out.print(word.charAt(word.length() - 1 - i));
    }

    System.out.println();
  }
}
