package Example1;

public class HowToReverseString {
    public static void main(String[] args) {
        String original = "ZoomMeeting";
        //in order to reverse a String we need an empty String that way we can store reverse of String
        String reverse = "";
        //to reverse a String we can use for loop
        //we start from original.length-1 and finish with index zero and we iterate --
        for (int i = original.length()-1; i >= 0; i--) {
            reverse = reverse + original.charAt(i); // we added each character of original in reverse
        }
        System.out.println(reverse);
    }
}