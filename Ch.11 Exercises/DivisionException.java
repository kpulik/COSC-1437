// Chapter11Assignment
// Kevin Pulikkottil
// 12/4/22
// JDK version 14.0.1

import java.util.Scanner;

public class DivisionException extends Exception {

    // the exception class that gives out the error message
    public DivisionException() {
        super("Error: you cannot divide by zero");
    }

    // divides the inputted numbers and returns the value
    public static double divide(double numerator, double denominator) throws DivisionException {
        if (denominator == 0)
            throw new DivisionException();
        return numerator / denominator;
    }

    public static void main(String[] args) {
       // asking the user for 2 values to divide
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = in.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = in.nextDouble();
       // printing the result / printing error message if user divides by 0
        try {
            double result = divide(numerator, denominator);
            System.out.println(result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }
    }
}
