import java.util.Scanner;
import java.util.ArrayList;
class Student //Drew Balaji
{
      private int studentId;
      private String studentName;
      private String phoneHome;
      private String parentName;
      private int yearGrad;
      private String[] classesTaken;
      public Student()//no args constructor
      {

      }
      public Student(int initStudentId, String initStudentName, String initPhoneHome, String initParentName, int initYearGrad, String[] initClassesTaken)
      {//constructors
      studentId = initStudentId;
      studentName = initStudentName;
      phoneHome = initPhoneHome;
      parentName = initParentName;
      yearGrad = initYearGrad;
      classesTaken = initClassesTaken;
      }
      
      
      //setters below
      public void setStudentId(int newStudentId)
      {
          studentId = newStudentId;
      }
      
      public void setStudentName(String newStudentName)
      {
          studentName = newStudentName;
      }
      public void setPhoneHome(String newPhoneHome)
      {
          phoneHome = newPhoneHome;
      }
      public void setParentName(String newParentName)
      {
          parentName = newParentName;
      }
      public void setYearGrad(int newYearGrad)
      {
          yearGrad = newYearGrad;
      }
      public void setClassesTaken(String[] newClassesTaken)
      {
        classesTaken = newClassesTaken;
      }
      //getters below
      public int getStudentId()
      {
        return studentId;
      }
      public String getStudentName()
      {
        return studentName;
      }
      public String getPhoneHome()
      {
        return phoneHome;
      }
      public String getParentName()
      {
        return parentName;
      }
      public int getYearGrad()
      {
        return yearGrad;
      }
      public String[] getClassesTaken()
      {
        return classesTaken;
      }
      //to string method for printing
      public String toString()
      {
        String classesTakenA = "";
        for(int i = 0; i < classesTaken.length; i++)
        {
          classesTakenA += classesTaken[i] + ", ";
        }
        return studentId + ", " + studentName + ", " + phoneHome + "" +  parentName + ", " + yearGrad + ", " + classesTaken;
      }
}
