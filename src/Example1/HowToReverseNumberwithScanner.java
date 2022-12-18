package Example1;

import java.util.Scanner;

public class HowToReverseNumberwithScanner {
    public static void main(String[] args) {
//        /**
//         * Write a code where it ask user to enter an integer number
//         * - Reverse the given number and print the result
//         * - Example input ( 5678 )
//         * - Example output ( 8765 )
//         *
//         *   Ex: 12 >> 21
//         *    36    63
//         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;
        int original = number;
        while (number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if (reverse == original){
            System.out.println(original +" is Palindrome number");
        }else {
            System.out.println(original +" is not Palindrome number");
        }
    }
}
