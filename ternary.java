public class ternary {
  
  public static void main(String[] args) {

    /* 
    int a = 10;
    int b = 20;
    int c = 30;

    // Using ternary operator to find the maximum among three numbers
    int max = (a > c) ? ( a < b ) ? a : b : c ;

    System.out.println("The maximum value is: " + max);

    */


    int a = 10;
    int b = 20;
    int c = 30;
    int d = 5;

    // Using nested ternary operator to find the maximum among four numbers

    int max = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

    System.out.println("The maximum value is: " + max);

  }


}
