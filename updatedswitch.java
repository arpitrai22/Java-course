import java.util.Scanner;

public class updatedswitch {
  
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the day of the week: ");
    String day = scanner.nextLine();

    switch (day) {

      case "Saturday" , "Sunday" -> System.out.println("It's the weekend!");

      case "Monday" -> System.out.println("Start of the work week!");

      case "Tuesday" -> System.out.println("It's Tuesday!");

      case "Wednesday" -> System.out.println("It's Wednesday!");

      case "Thursday" -> System.out.println("It's Thursday!");

      case "Friday" -> System.out.println("It's Friday!");

      default -> System.out.println("Invalid day");


    }

    scanner.close();

  }

}
