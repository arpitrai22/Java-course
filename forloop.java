public class forloop {
      
    public static void main(String[] args) {

        int i = 1;  // Initialize i to 1

        // For loop that prints numbers from 1 to 5

        for (i = 1; i <= 5; i++) {  // Loop will execute while i is less than or equal to 5

            System.out.println("Outer loop: " + i);  // Print the current value of i


          for (int j = 1; j <= 5; j++) {

            // Inner loop that prints numbers from 1 to 5
            System.out.println("Inner loop: " + j);  // Print the current value of j
          }

        
    }
}

}



