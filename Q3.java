package Assignment_3;

import java.util.*;

public class Q3 {
    public static void main(String args[]) {

        // Write a program to sort strings (using library function).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:"); // Input String
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();// convert string to character array to apply inbuilt function
        Arrays.sort(charArray);// sort the character array
        System.out.println("Sorted string:"); // Input String
        System.out.println(String.valueOf(charArray));// print string output

        sc.close();

    }

}