package Arrays;

public class FrequencyOfCharacters {
    //(String) Frequency of Characters
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    public static void main(String[] args) {
        frequencyMethod("AABBCCCCDF");
    }
    public static void frequencyMethod(String param1){
        char [] charArray = param1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            char charNew = ' ';
            for (int j = i+1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]){
                    count ++;
                    //System.out.println(charArray[i] + " = " + count);
                }
            }charNew = charArray[i];
            System.out.println(charNew + " " + count);
        }
    }
}
