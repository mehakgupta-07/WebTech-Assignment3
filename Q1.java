
package Assignment_3;

import java.util.Scanner;

public class Q1 {

    // Write a java program to compare two strings lexicographically (without using
    // library function).
    public static int lexicographicalComparison(String s1, String s2) {

        for (int i = 0; i < s1.length() && i < s2.length(); i++) {

            // for a specific char i in the string
            // if string1[i] == string2[i], continue checking for equality in remaining
            // strings
            if ((int) s1.charAt(i) == (int) s2.charAt(i)) {
                continue;
            }

            // if string1[i] > string2[i], return 1
            else if ((int) s1.charAt(i) > (int) s2.charAt(i)) {
                return 1;
            }

            // if string1[i] < string 2[i], return -1
            else {
                return -1;
            }

        }

        // if lexicograohically same i.e. string1[i] == string2[i], o/p is 0
        if (s1.length() == s2.length()) {
            return 0;
        }
        // if string1 > string2, o/p is 1
        else if (s1.length() > s2.length()) {
            return 1;
        }
        // if string1 < string 2, o/p is -1
        else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First input String
        System.out.println("Enter string 1:");
        String string1 = sc.nextLine();

        // Second input String
        System.out.println("Enter string 2:");
        String string2 = sc.nextLine();

        int ans = lexicographicalComparison(string1, string2);
        if (ans == 1) {
            System.out.println("String 1 is lexicographically larger than String 2");
        } else if (ans == -1) {
            System.out.println("String 2 is lexicographically larger than String 1");
        } else {
            System.out.println("Strings are of equal length");
        }

        sc.close();

    }
}