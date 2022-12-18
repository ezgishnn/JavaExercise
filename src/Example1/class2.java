package Example1;

public class class2 {
    public static void main(String[] args) {
        System.out.println(Variables.staticVariable); //we can call static variable another class

        Variables object = new Variables();
        System.out.println(object.instanceVariable);//we need to create an object in order to call instance variables

        Variables.Osman();//we can call local variables
    }
}
