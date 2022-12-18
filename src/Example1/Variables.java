package Example1;

public class Variables {
    static String staticVariable = "Ezgi";//this is static variable
    public static String publicStaticVariable = "Cihan";//we create this static variable as public to be able to call from another package

    int instanceVariable = 5; //instance variable because it is in class but outside of method, block and constructor

    public static void Osman(){//method
        //static String e = "ewde"; //we can not define static variable in static method
        String localVariable = "Kivi";//this variable is local variable because we defined it in Osman method. we can not
        System.out.println(localVariable);
    }

    {//block
       // static String e = "ewde";// we can not static variable in block too
        String localVariable1 = "Xezal";
    }

    public Variables(){//constructor
        //static String e = "ewde"; // we can not define it in constructor too
        String localVariable2 = "Cihan";
    }
}
