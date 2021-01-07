import java.util.Scanner;

/**
 * Main driver class that displays the UI.
 *
 * @author Jonathan Gai
 */
class Main {
  /* We can have multiple teachers if we have time to extend the project.
   * private boolean login() {
   * System.out.print("Username:");
   * System.out.print("Password:");
   * }
   */
  public static Teacher teacher;
  public static Scanner sc = new Scanner(System.in);

  /**
   * Displays the menus options and prompts the user for what to display.
   *
   * @return Boolean value that keeps the loop running if True and stop if False.
   */
  private static boolean menu() {
    System.out.println("s to display list of students");
    System.out.print("> ");
    switch (sc.nextLine()) {
      case "s":
        while (menuStudents()) {};
        return true;
      case "c":
        while (menuClasses()) {};
        return true;
      case "g":
        while (menuGrades()) {};
        return true;
      default:
        return false;
    }
  }

  /**
   * Displays the student list and prompts the user for what to display.
   *
   * @return Boolean value that keeps the loop running if True and stop if False.
   */
  private static boolean menuStudents() {
    // Teacher objects need to be able to access teachClasses.
    System.out.print("menuStudents filler text");
    return false;
  }

  /**
   * Displays the class list and prompts the user for what to display.
   *
   * @return Boolean value that keeps the loop running if True and stop if False.
   */
  private static boolean menuClasses() {
    // Teacher objects need to be able to access teachClasses.
    System.out.print("menuClasses filler text");
    return false;
  }

  /**
   * Displays the grade book and prompts the user for what to display.
   *
   * @return Boolean value that keeps the loop running if True and stop if False.
   */
  private static boolean menuGrades() {
    // Teacher objects need to be able to access teachClasses.
    System.out.print("menuGrades filler text");
    return false;
  }

  public static void main(String[] args) {
    teacher = new Teacher(0, "John Doe", "john.doe@gmail.com");
    boolean menuResult = true;
    while (menuResult) {
      menuResult = menu();
    }
  }
}
