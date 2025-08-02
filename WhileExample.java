class WhileExample {


    public static void main(String[] args) {

        // Example of a while loop in Java
        int i = 0;

        // Loop until i is less than or equal to 5

        while (i <= 5) {  //In while loop, for any true condition, the loop will execute

            System.out.println("i is: " + i);

            // Increment i to avoid infinite loop
            i++;


        }
    }
}