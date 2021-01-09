import java.util.ArrayList;

/**
 * Naina Purushothaman Classes.java Has a constructor, Has getter and setter methods for all
 * instance variables, methods to add/remove Student objects and method to check if a Student is in
 * this class list
 */
public class Classes {
  // instance variables

  // the name of the class
  private String className;

  // an ArrayList of students in the class, stores "Student" objects
  //private ArrayList<Student> students; 

  private ArrayList<StudentGrades> sgrades;

  // the teacher of this class
  private Teacher teacher;

  // no args constructor
  public Classes() {
    className = "";
    sgrades = new ArrayList<StudentGrades>();
    teacher = new Teacher();
  }

  // constructor which initializes all instance variables
  public Classes(String className, ArrayList<StudentGrades> sg, Teacher teacher, ArrayList<Student> students) {
    this.className = className;
    this.sgrades = sg;
    this.teacher = teacher;
    //this.students = students; //if studentgrade and student have same id i think we can use a method to get Students without storing additional objects likethis
  }

  // mutator(setter) method for changing the name of the class
  public void setName(String name) {
    className = name;
  }

  // getter method for returning the class name
  public String getName() {
    return className;
  }

  // method for adding a studentgrade object to this class list
  public void add(StudentGrades s) {
    sgrades.add(s);
  }

  // method for removing a student object to this class list by inputting the
  // student id
  public void remove(int studentId) {
    // loops through the list of students and finds the one with the
    // corresponding studentId and removes them
    int index = -1;
    for (int j = 0; j < sgrades.size(); j++) {
      if (sgrades.get(j).getId() == studentId) {
        index = j;
        sgrades.remove(j);
      }
    }

    if (index == -1) {
      System.out.println("This student is not in this class.");
    }
  }

  // method that returns true if the student is in the class and false if not by
  // inputting their student id
  public boolean isStudent(int studentId) {
    // loops through the list of students and finds the one with the
    // corresponding studentId
    int index = -1;
    for (int j = 0; j < sgrades.size(); j++) {
      if (sgrades.get(j).getId() == studentId) {
        index = j;
      }
    }

    if (index == -1) {
      return false;
    }
    return true;
  }

  //method that prints out the names of the students in the Student Array List 
  public void printStudents(ArrayList<Student> slist)
  {
    for(int i = 0; i < sgrades.size(); i++)
    {
      int tempid = sgrades.get(i).getId();
      Student tempstu = new Student();
      for(Student stu: slist){
        if(stu.getStudentId() == tempid){
        tempstu = stu;
        System.out.println(tempstu.getStudentName()); 
        }
      }
      
      
    }
  }
}
