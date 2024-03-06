// Chapter10Assignment
// Kevin Pulikkottil
// 11/20/22
// JDK version 14.0.1

public class Driver {

  public static void main(String[] args) {

    // making an array with 4 people
    Person[] people = new Person[4];

    // the first 2 People objects
    people[0] =
        new Person("John Doe", "123 Main Street,TX 50740", "123-567-9900");
    people[1] =
        new Person("Peter Parker", "13 River Street,TX 12770", "563-121-1270");

    // the next 2 Customer objects
    people[2] = new Customer("James Smith", "31 Forest Street,TX 12341",
                             "121-777-1270", "567-5690");
    people[3] = new Customer("Mary Thin", "31 Sky Street,TX 67000",
                             "121-777-2222", "567-7788");

    // for loop to print each object
    for (Person person : people)
      System.out.println(person + ""
                         + "\n");
  }
}

class Person {

  private String name;
  private String address;
  private String phoneNumber;

  // constructor with no arguments
  public Person() { this("", "", ""); }

  // constructor with 3 arguments
  public Person(String name, String address, String phoneNumber) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public String getAddress() { return address; }

  public void setAddress(String address) { this.address = address; }

  public String getPhoneNumber() { return phoneNumber; }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // toString() method for output
  @Override
  public String toString() {
    return "Name: " + name + "\n"
        + "Address: " + address + "\n"
        + "Phone: " + phoneNumber;
  }
}

class Customer extends Person {

  private String customerNumber;

  // constructor with no arguments
  public Customer() { customerNumber = ""; }

  // constructor with 4 arguments
  public Customer(String name, String address, String phoneNumber,
                  String customerNumber) {
    super(name, address, phoneNumber);
    this.customerNumber = customerNumber;
  }

  public String getCustomerNumber() { return customerNumber; }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  // toString() method for output
  @Override
  public String toString() {
    return super.toString() + "\n"
        + "Customer Number: " + customerNumber;
  }
}
