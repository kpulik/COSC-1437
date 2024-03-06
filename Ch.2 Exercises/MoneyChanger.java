// Kevin Pulikkottil
// 9/4/22
// JDK 14.0.1
// breaks change into the correct coins

import javax.swing.JOptionPane;
public class MoneyChanger{
    public static void main (String[] args){
     // declaring variables
     String answer = JOptionPane.showInputDialog (null, "Enter amount of change:");
     int cents = (int)(Double.parseDouble (answer) * 100);
     int centsLeft, dollars, quarters, dimes, nickels, pennies;
     
     // begin calculations
    dollars = cents / 100;
    centsLeft = cents % 100;
    quarters  = centsLeft / 25;
    centsLeft = centsLeft % 25;
    dimes = centsLeft / 10;
    centsLeft = centsLeft % 10;
    nickels = centsLeft / 5;
    centsLeft = centsLeft % 5;
    pennies = centsLeft;
    
    // printing results
    JOptionPane.showMessageDialog (null, 
            "Total Cents: " + cents
            + "\nDollars: " + dollars
            + "\nQuarters: " + quarters
            + "\nDimes: " + dimes
            + "\nNickels: " + nickels
            + "\n Pennies: " + pennies);
    }
}