package Example1;

public class StaticMethodPurpose {
    public static void staticMethod(){
        String name = "This is static method";
        System.out.println(name);
        //when we want to call this method from other class, we don't need to create an object
        //second purpose of static method is we can use for creating utility classes
    }
}
