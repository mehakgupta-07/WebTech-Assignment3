package Assignment_3;

import java.util.Scanner;

public class Q4 {

    // Write a ConsoleProgram that reads in a number from the user and then displays
    // the
    // Hailstone sequence for that number (Pick some positive integer and call it n
    // If n is even divide it by two.
    // If n is odd, multiply it by three and add one.
    // Continue this process until n is equal to one. )

    public static void main(String[] args) {

        System.out.println("Input Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid Input");
        }
        while (num != 1 && num > 0) {
            System.out.println(num);
            if (num % 2 == 0) {
                num = num / 2; // if n is even divide by 2
            } else {
                num *= 3;
                num += 1; // if n is odd multiply by 3 and add 1
            }
        }

        System.out.println(1);
        sc.close();

    }

}
