import java.util.Scanner;
import java.util.ArrayList;
class Tester1 {
public static void main(String[] args) 
  { //"tester" class
    Scanner scan = new Scanner(System.in);
    String answer;
    String[] takenClasses = {"Precalculus Honors", "AP Chemistry", "APCS", "APUSH", "American Lit"};
    Student s1 = new Student(225068, "Drew Balaji", "(513)3713920", "Anita", 22, takenClasses);//sample for a student
    ArrayList<Student> arrL = new ArrayList<Student>();
    arrL.add(s1);
    System.out.print("Do you want to add another student? Y/N");
    answer = scan.nextLine();
    if (answer.equals("Y") || answer.equals("y"))
    {
      System.out.println("This is the part where you input the student's info.");
      System.out.print("Enter the id: ");
      int idStudent = scan.nextInt();
      scan.nextLine();
      System.out.print("Enter the student's name: ");
      String nameStudent = scan.nextLine();
      System.out.print("Enter the home phone number, with the area code in parentheses, and with space between the area code and the number: ");
      String homePhone = scan.nextLine();
      System.out.print("Enter the name of the parent: ");
      String nameParent = scan.nextLine();
      System.out.print("Enter the last two digits of the student's graduating year: ");
      int gradYear = scan.nextInt();
      scan.nextInt();
      System.out.print("Provide the classes, seperated by commas:\n");
      String[] classesTaken = scan.nextLine().split(",");
      Student s2 = new Student(idStudent, nameStudent, homePhone, nameParent, gradYear, classesTaken);
      arrL.add(s2);
      for(int j = 0; j < arrL.size(); j++)
      {
        System.out.println(arrL.indexOf(j));
      } 
    }
    else if(answer.equals("N") || answer.equals("n"))
    {
      System.out.println(arrL);
    }
    else
    {
      
    }
  }
}