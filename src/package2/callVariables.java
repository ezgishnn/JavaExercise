package package2;

import Example1.Variables;

public class callVariables {
    public static void main(String[] args) {
        Variables.Osman();
        System.out.println(Variables.publicStaticVariable);//we can call only public static variable
        //we can not call static variable because it is not public

    }
}
