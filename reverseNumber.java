import java.util.Scanner;

/**
 * Created by hyunchoi on 1/5/17.
 * Program checks if cube of integers of input equals input
 * Project 1 for Grand Circus Pre-work
 */

public class reverseNumber {
    /*
     *  code below was used for older deliverable 1 which asked to check if the input
     *  equaled the sum of its digits cubed

    public static int calculateCube(int input) {
        int total = 0;
        int holder = input;

        while (holder != 0) {
            // grabs the last digit of int and cubes it
            total += ((holder % 10) * (holder % 10) * (holder % 10));

            // cuts off last digit of int
            holder /= 10;
        }

        //System.out.println(total);
        return total;
    }

    public static void checkCube(int theInput, int theCubed) {
        if (theInput == theCubed) System.out.println("True");
        else System.out.println("False");
    }

    */

    public static int findReverse(int input) {
        int theReverse = 0;

        // while loop will loop until integer hits 0
        while (input != 0) {
            // adding the mod 10 of input will add the last digit of input to theReverse,
            // which should start at 0
            theReverse += input % 10;

            /* multiplying theReverse by 10 will add a 0 to the end, where you can add the
             * next digit from the input, issue here is when the last number is 0 since
             * integers can't start w/ a 0 at the front
            */
            theReverse *= 10;

            // diving the input by 10 will chop off the digit that was just added to theReverse
            input /= 10;
        }

        // an extra 0 is added so this chops that off
        theReverse /= 10;

        return theReverse;
    }

    public static void main(String[] args) {
        // System.out.println("This program will check if your input equals its digits cubed.");
        // System.out.print("Please enter an integer: ");
        System.out.println("This program will return the reverse of any integer you enter!");
        System.out.print("Please enter an integer: ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int reversed = findReverse(i);

        System.out.println("The reverse of your input, " + i + ", is: " + reversed + ".");
    }
}