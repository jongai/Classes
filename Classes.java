/** 
 * Naina Purushothaman 
 * Classes.java 
 * Has a constructor, Has getter and setter methods for all instance variables, methods to add/remove Student objects and 
 * method to check if a Student is in this class list 
 * 
 */

public class Classes
{
	//instance variables

	//the name of the class  
	private String className; 

	//an ArrayList of students in the class, stores "Student" objects  
	private ArrayList<Student> students; 

	//the teacher of this class  
	private Teacher teacher; 

  //no args constructor
  public Classes()
  {
    className = ""; 
    students = new ArrayList<Student>(); 
    teacher = new Teacher(); 
  }

	//constructor which initializes all instance variables 
	public Classes(String className, ArrayList<Student> students, Teacher teacher)
	{
		this.className = className; 
		this.students = students; 
		this.teacher = teacher; 
	}

	//mutator(setter) method for changing the name of the class 
	public void setName(String name) 
	{
		className = name; 
	}

	//getter method for returning the class name 
	public String getName()
	{
		return className; 
	}

	//method for adding a student object to this class list 
	public void add(Student s1) 
	{
		students.add(s1); 
	}

	//method for removing a student object to this class list by inputting the student id 
	public void remove(int studentId)
	{
		//loops through the list of students and finds the one with the corresponding studentId and removes them
		int index = -1; 
		for(int j = 0; j < students.size(); j++)
		{
			if(students[j].getId == studentId)
			{
				index = j; 
				students.remove(j); 
			}
		}

		if(index == -1)
		{
			System.out.println("This student is not in this class."); 
		}
	}

	//method that returns true if the student is in the class and false if not by inputting their student id
	public boolean isStudent(int studentId)
	{
		//loops through the list of students and finds the one with the corresponding studentId 
		int index = -1; 
		for(int j = 0; j < students.size(); j++)
		{
			if(students[j].getStudentId == studentId)  
			{
				index = j;  
			}
		}

		if(index == -1)
		{
			return false; 
		}
		return true; 
	}
}
