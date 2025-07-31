import java.util.Scanner;

public class updatedswitch {
  
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the day of the week: ");
    String day = scanner.nextLine();

    String result = "";


    /* Convert the day to lowercase for case-insensitive comparison 
    day = day.toLowerCase();

    switch (day) {

      case "saturday", "sunday" -> System.out.println("It's the weekend!");

      case "monday" -> System.out.println("Start of the work week!");

      case "tuesday" -> System.out.println("It's Tuesday!");

      case "wednesday" -> System.out.println("It's Wednesday!");

      case "thursday" -> System.out.println("It's Thursday!");

      case "friday" -> System.out.println("It's Friday!");

      default -> System.out.println("Invalid day");


    }

    */

    /* 

    // Using switch expression for more concise code
    // This requires Java 12 or later

    switch (day.toLowerCase()) {
        case "saturday", "sunday" -> result = "It's the weekend!";
        case "monday" -> result = "Start of the work week!";
        case "tuesday" -> result = "It's Tuesday!";
        case "wednesday" -> result = "It's Wednesday!";
        case "thursday" -> result = "It's Thursday!";
        case "friday" -> result = "It's Friday!";
        default -> result = "Invalid day";
    }
    */

    // More concise switch expression

    // This requires Java 12 or later
    // Using switch expression for more concise code

    /* 


    result = switch (day.toLowerCase()) {
        case "saturday", "sunday" -> "It's the weekend!";
        case "monday" -> "Start of the work week!";
        case "tuesday" -> "It's Tuesday!";
        case "wednesday" -> "It's Wednesday!";
        case "thursday" -> "It's Thursday!";
        case "friday" -> "It's Friday!";
        default -> "Invalid day";
    };

    */

    //If we don't want to use arrow syntax, we can use yield statement

    result = switch (day.toLowerCase()) {
        case "saturday", "sunday" : yield "It's the weekend!";
        case "monday" : yield "Start of the work week!";
        case "tuesday" : yield "It's Tuesday!";
        case "wednesday" : yield "It's Wednesday!";
        case "thursday" : yield "It's Thursday!";
        case "friday" : yield "It's Friday!";
        default : yield "Invalid day";
    };

    System.out.println(result);

    // Close the scanner to prevent resource leaks
    if (scanner != null) 

        scanner.close();
  

  }

}
