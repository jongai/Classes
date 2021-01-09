/**
 * Assignment class creates an object teacher information.
 *
 * @author Wes G, framework created by Jonathan Gai
 */
import java.util.ArrayList;

public class Teacher {
  private int id;
  private String name;
  private String contact;
  private ArrayList<Classes> teachClasses = new ArrayList<Classes>();

  /**
   * Constructor for Teacher class.
   *
   * @param id The school id of the teacher.
   * @param name The name of the teacher.
   * @param contact The phone number of the teacher.
   */
  public Teacher(int id, String name, String contact) {
    this.id = id;
    this.name = name;
    this.contact = contact;
  }

  /** No-arg contructor for Teacher class. */
  public Teacher() {
    id = 0;
    name = "";
    contact = "";
  }

  /**
   * Method to set the teacher's name.
   *
   * @param name The teacher's name.
   */
  public void setTeacherName(String name) {
    this.name = name;
  }

  /**
   * Method to set the id of the teacher.
   *
   * @param id teacher's id.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Method to set the contact of the teacher.
   *
   * @param contact The teacher's contact information
   */
  public void setRawGrade(String contact) {
    this.contact = contact;
  }

  /**
   * Method to get the teacher's name.
   *
   * @return The teacher's name.
   */
  public String getTeacherName() {
    return name;
  }

  /**
   * Method to get the teacher's id.
   *
   * @return The teacher's id.
   */
  public double getTeacherId() {
    return id;
  }

  /**
   * Method to get the Teacher's contact.
   *
   * @return The teacher's contact.
   */
  public String getTeacherContact() {
    return contact;
  }

  /**
   * Method to add a class
   *
   * @param The name of the class
   */
  public void addClass(Classes className) {
    teachClasses.add(className);
  }

  /**
   * Method to remove a class
   *
   * @param The name of the class
   */
  public void removeClass(Classes className) {
    teachClasses.remove(className);
  }

  /**
   * Method to list classes
   *
   *
   */
   public void listClasses(){
     for(var clas : teachClasses){ //we know we misspelled class, we just didn't have a better variable name
       System.out.println(clas);
     }
   }
   
  /**
   * Method to list all of the teacher's students
   *
   *
   */
   public void viewAllStudents(ArrayList<Student> slist){
     for(var clas: teachClasses){
       clas.printStudents(slist);//students may be printed multiple times
     }
   }

  ///////////////////////////////////////////////////

  /* to do
   * fix remove class method
   * to string method
   *
   */
}
