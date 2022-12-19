package package2;

import Example1.VariablesCreating;

public class callVariables {
    public static void main(String[] args) {
        System.out.println(VariablesCreating.publicStaticVariable);//we can call only public static variable.
        // if static variable is not public, we can not call it
    }
}
