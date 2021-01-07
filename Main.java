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
        menuStudents();
        return true;
      default:
        return false;
    }
  }

  private static boolean menuStudents() {
    // Teacher objects need to be able to access teachClasses.
    return true;
  }

  public static void main(String[] args) {
    teacher = new Teacher(0, "John Doe", "john.doe@gmail.com");
    boolean menuResult = true;
    while (menuResult) {
      menuResult = menu();
    }
    ;
  }
}
