public class StudentCreator {
  public static void main(String arg[]) {
    Student student1 = new Student("Bob", 17);
    Student student2 = new Student("Jan", 13);
    System.out.println("Name: " + student1.getName());
    System.out.println("Age: " + student1.getAge());
    System.out.println("Type Of Student: " + student1.getType());
    System.out.println("Name: " + student2.getName());
    System.out.println("Age: " + student2.getAge());
    System.out.println("Type Of Student: " + student2.getType());
    student1.setAge(18);
    System.out.println("Name: " + student1.getName());
    System.out.println("Age: " + student1.getAge());
    System.out.println("Type Of Student: " + student1.getType());
  }
}
