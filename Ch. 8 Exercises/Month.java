// Create a class Month
public class Month {
  // Used to store the month number
  int monthNumber;

  // Constructor to create object
  public Month(int m) {
    // If month number is less than 1 or greater than 12
    if (m < 1 || m > 12)

      // Set month number to 1
      monthNumber = 1;

    // If month number is between 1and 12
    else

      // Set month number to m
      monthNumber = m;
  }

  // Create a method used to set the month number
  public void setMonthNumber(int m) {
    // If month number is less than 1 or greater than 12
    if (m < 1 || m > 12)

      // Set month number to 1
      monthNumber = 1;

    // If month number is between 1and 12
    else

      // Set month number to m
      monthNumber = m;
  }

  // Method used to get the month number
  public int getMonthNumber() { return monthNumber; }

  // Method used to get the month name
  public String getMonthName() {
    // Used to store the month name
    String monthName = "";

    // Select based on month number
    switch (monthNumber) {
    case 1:
      monthName = "January";
      break;
    case 2:
      monthName = "February";
      break;
    case 3:
      monthName = "March";
      break;
    case 4:
      monthName = "April";
      break;
    case 5:
      monthName = "May";
      break;
    case 6:
      monthName = "June";
      break;
    case 7:
      monthName = "July";
      break;
    case 8:
      monthName = "August";
      break;
    case 9:
      monthName = "September";
      break;
    case 10:
      monthName = "October";
      break;
    case 11:
      monthName = "November";
      break;
    case 12:
      monthName = "December";
      break;
    }

    // Retunr the month name
    return monthName;
  }

  // Method used to get the season
  public String getSeason() {
    // If month is December,January, February
    if (monthNumber == 12 || (monthNumber >= 1 && monthNumber <= 2))

      // Return "Winter"
      return "Winter";

    // If month is March, April, May
    else if (monthNumber >= 3 && monthNumber <= 5)

      // Return "Spring"
      return "Spring";

    // If month is June, July, August
    else if (monthNumber >= 6 && monthNumber <= 8)

      // Return "Summer"
      return "Summer";

    // If month is September, October, November
    else

      // Return "Fall"
      return "Fall";
  }

  // Method used to return the string represntation
  public String toString() {
    return "Month Number: " + monthNumber + "\nMonth Name: " + getMonthName() +
        "\nSeason: " + getSeason();
  }

  // Method used to check the months are same or not
  public boolean equals(Month month2) {
    // If the month number is same
    if (monthNumber == month2.monthNumber)

      // Return true
      return true;

    // If the month number is different
    else

      // Return false
      return false;
  }
}
