package Example1;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        //How to check String is Palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String name = sc.nextLine();
        //in order to check a String is palindrome or not first we need to create an empty String
        String reverse = "";
        //we can reverse the String with for loop. We start from name.length-1 end with index 0 and iterate --
        for (int  i = name.length()-1;   i>= 0;  i--) {
            reverse = reverse + name.charAt(i);
        }if (name.equals(reverse)){
            System.out.println(name + " is Palindrome");
        }else {
            System.out.println(name + " is not Palindrome");
        }
    }
}
