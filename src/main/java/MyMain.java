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
        System.out.println(Mathey.max(1, 2));
        System.out.println(Mathey.max(2, 1));

        System.out.println(Mathey.max(2.2, 19.2));
        System.out.println(Mathey.max(1.1, 12.2));

        System.out.println(Mathey.max(2, 6, 3));
        System.out.println(Mathey.max(3, 2, 1));

        System.out.println(Mathey.max(2.2, 6.4, 3.4, 7.8));
        System.out.println(Mathey.max(8.7, 6.7, 4.3, 9.3));

        System.out.println(Mathey.random(5,10));
        System.out.println(Mathey.random(9,22));

        System.out.println(Mathey.random(10));
        System.out.println(Mathey.random(9));
    }

}


