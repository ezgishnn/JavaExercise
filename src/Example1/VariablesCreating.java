package Example1;

public class VariablesCreating {
    static String staticVariable = "This is static variable";//this is static variable
    public static String publicStaticVariable = "This is public static variable";//we create this static variable as public to be able to call from another package

    int instanceVariable = 5; //instance variable because it is in class but outside of method, block and constructor
    String instanceVariable1 = "This is instance variable";
    public static void methodOfLocalVariable(){//method
        //static String e = "ewde"; //we can not define static variable in static method
        String localVariable = "This is local variable";//this variable is local variable because we defined it in method
        System.out.println(localVariable);
    }

    {//block
       // static String e = "ewde";// we can not define static variable in block too
        String localVariable1 = "Xezal";
    }

    public VariablesCreating(){//constructor
        //static String e = "ewde"; // we can not define static variable in constructor too
        String localVariable2 = "Cihan";
    }
}
