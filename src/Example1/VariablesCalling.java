package Example1;

public class VariablesCalling {
    public static void main(String[] args) {
        System.out.println(VariablesCreating.staticVariable); //we can call static variable another class

        VariablesCreating object = new VariablesCreating();
        System.out.println(object.instanceVariable);//we need to create an object in order to call instance variables

        VariablesCreating object2 = new VariablesCreating();
        System.out.println(object2.instanceVariable1);

        VariablesCreating.methodOfLocalVariable();//we can call method but we can not call local variable
    }
}
