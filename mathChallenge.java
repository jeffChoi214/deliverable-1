import java.util.Scanner;

/**
 * Created by hyunchoi on 1/5/17.
 * Program checks if cube of integers of input equals input
 * Project 1 for Grand Circus Pre-work
 */
public class mathChallenge {
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

    public static void main(String[] args) {
        System.out.println("This program will check if your input equals its digits cubed.");
        System.out.print("Please enter an integer: ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int cubed = calculateCube(i);

        checkCube(i, cubed);
}
