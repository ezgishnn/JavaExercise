package Example1;

public class HowToReverseNumber {
    public static void main(String[] args) {
        int number = 1453;
        int original = number;//because we'll modify the number we need to keep the number in another int
        int reverse = 0;//to store the reverse of the number we need an empty int
        //in order to reverse a number we need to use some algorithm with while loop
        while (number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if (original == reverse){
            System.out.println(original + " is Palindrome number");
        }else {
            System.out.println(original + " is not Palindrome number");
        }
    }
}
