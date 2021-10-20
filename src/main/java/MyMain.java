import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        double random = (Math.random() * 10) + 10;
        return (int) random;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        int x = randomTeen();
        int y = randomTeen();
        int z = randomTeen();
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println("The largest number is " + Mathey.max(x, y, z));
////        System.out.println("The smallest number is " + min);
        System.out.println("\nThe max of the 2 ints is " + Mathey.max(1, 2));
        System.out.println("The max of the 2 ints is " + Mathey.max(2, 1));

        System.out.println("\nThe max of the 2 doubles is " + Mathey.max(2.2, 19.2));
        System.out.println("The max of the 2 doubles is " + Mathey.max(1.1, 12.2));

        System.out.println("\nThe max of the 3 ints is " + Mathey.max(2, 6, 3));
        System.out.println("The max of the 3 ints is " + Mathey.max(3, 2, 1));

        System.out.println("\nThe max of the 4 doubles is " + Mathey.max(2.2, 6.4, 3.4, 7.8));
        System.out.println("The max of the 4 doubles is " + Mathey.max(8.7, 6.7, 4.3, 9.3));

        System.out.println("\nA random int between 5 and 10 is " + Mathey.randomInteger(5,10));
        System.out.println("A random int between 9 and 22 is " + Mathey.randomInteger(9,22));

        System.out.println("\nA random int between 0 and 10 is " + Mathey.randomInteger(10));
        System.out.println("A random int between 5 and 9 is " + Mathey.randomInteger(9));

        System.out.println("\n2 raised to the 3rd power is " +  Mathey.pow(2,3));
        System.out.println("3 raised to the 23rd power is " + Mathey.pow(3,4));

        System.out.println("\nThe absolute value of -5 is " + Mathey.abs(-5));
        System.out.println("The absolute value of 23 is " + Mathey.abs(23));

        System.out.println("\n2.7 rounded is " + Mathey.round(2.7));
        System.out.println("5.2 rounded is " + Mathey.round(5.2));

        System.out.println("\n8.6's floor is " + Mathey.floor(8.6));
        System.out.println("3.1's floor is " + Mathey.floor(3.1));

        System.out.println("\n6.8's ceiling is " + Mathey.ceiling(6.8));
        System.out.println("1.2's floor is " + Mathey.ceiling(1.2));

        double sum = (Mathey.pow(5, 2) + Mathey.pow(12, 2));
        double sqrt = (int) (Mathey.sqrt(sum));

        System.out.println("Pythagoras theorem of 5^2 + 12^2 = c^2 is " + sqrt);

    }

}


