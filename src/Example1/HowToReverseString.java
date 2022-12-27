package Example1;

public class HowToReverseString {
    public static void main(String[] args) {
        String original = "ZoomMeeting";
        //in order to reverse a String we need an empty String that way we can store reverse of String
        String reverse = "";
        //to reverse a String we can use for loop
        //we start from original.length-1 and finish with index zero and we iterate --
        for (int i = original.length()-1; i >= 0; i--) {
            reverse = reverse + original.charAt(i); // we added each character of original in empty String
        }
        System.out.println(reverse);


        //I'll create an empty String.
        //So, I need to go to the last character to the first character for this.
        //I’ll use For Loop starts with last character and end point will be first character.
        //And I’ll add every character to the empty String.
        //Then I’ll print the String.
    }
}