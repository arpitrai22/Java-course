public class SwitchExample {
  
public static void main(String[] args) {

    // Example of a switch statement in Java
    // This switch statement checks the day of the week and prints the corresponding name



    int day = 3;       
    
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");
    }


  } 


}
