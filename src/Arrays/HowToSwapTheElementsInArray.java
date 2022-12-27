package Arrays;

import java.util.Arrays;

public class HowToSwapTheElementsInArray {
    public static void main(String[] args) {
        int [] array0 = {2, 45, -9, 7, 8, 9, 1875, 0, 9843, 3};
        swapElements(array0, 2, 4);
    }
    public static void swapElements(int [] param1, int a, int b){ //in order to swap two numbers in an Array first
        //we should add one int[] parameter then two int numbers to the method
        int temp = 0; //we create int temp = 0 to use later on
        temp = param1[a]; //we assign param1[a] to the temp
        param1[a] = param1[b]; //then we assign param1[b] to the param1[a]
        param1[b] = temp; //then we assign temp to the param1[b]
        System.out.println(Arrays.toString(param1)); // and then we print param1
    }
}
