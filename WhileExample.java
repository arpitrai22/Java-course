class WhileExample {


    public static void main(String[] args) {

        // Example of a while loop in Java
        int i = 0;

        /* 
        // Loop until i is less than or equal to 5

        while (i <= 5) {  //In while loop, for any true condition, the loop will execute

            System.out.println("i is: " + i);

            // Increment i to avoid infinite loop
            i++;

        }

        */

        //Nested while loop example
        int j = 0;

        while (j < 3) {
            
            // Outer loop will execute while j is less than 3
            System.out.println("Outer loop j is: " + j);


            int k = 0;

            // Inner loop will execute while k is less than 2
            while (k < 2) {

                System.out.println("    Inner loop k is: " + k);

                // Increment k to avoid infinite loop
                k++;
            }
            // Increment j to avoid infinite loop
            j++;
        }

    }
}