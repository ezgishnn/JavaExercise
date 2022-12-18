package Example1;

import java.sql.Array;
import java.util.Arrays;

public class eachLoop {
    public static void main(String[] args) {
        String s = "abcdeftgj";


        String [] array = s.split("");
        for (String each: array) {
            System.out.println(each);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
