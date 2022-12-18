package Example1;

public class HowtoReverseStringwithMethod {
    public static void main(String[] args) {
        ters("edcba");
    }
    public static String ters(String param1){
        String reverse = "";
        for (int i = param1.length()-1; i >= 0 ; i--) {
            reverse = reverse + param1.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }
}
