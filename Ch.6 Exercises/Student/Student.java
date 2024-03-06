public class Student {
  public String name;
  public int Age;
  public String Type;

  public Student(String name, int Age) {
    this.name = name;
    this.Age = Age;
    this.Type = getType(Age);
  }
  public static String getType(int studentAge) {
    if (studentAge >= 11 && studentAge <= 13) {
      return "Middle School";
    } else if (studentAge >= 14 && studentAge <= 17) {
      return "High School";
    } else if (studentAge >= 18) {
      return "College";
    } else {
      return "Invalid";
    }
  }
  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public int getAge() { return Age; }

  public void setAge(int Age) {
    if (Age > 0) {
      this.Age = Age;
      this.Type = getType(Age);
    } else {
      System.out.println("Age cannot be lee than Zero");
    }
  }

  public String getType() { return Type; }

  public void setType(String Type) { this.Type = Type; }
}
