package Example1;

public class HowtoReverseNumberWithMethod {
    public static void main(String[] args) {
        reverseNumber(202);
    }
    public static int reverseNumber(int param1){
        int reverse = 0;
        int original = param1;
        while (param1 != 0){
            int lastDigit = param1 % 10;
            reverse = reverse * 10 +lastDigit;
            param1 = param1 / 10;
        }if (reverse == original){
            System.out.println(original +" is Palindrome");
        }else {
            System.out.println(original +" is not Palindrome");
        }
        return reverse;
    }
}
