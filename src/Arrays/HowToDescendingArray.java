package Arrays;

import java.util.Arrays;

public class HowToDescendingArray {
    //(Array) Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    public static void main(String[] args) {
        int [] myArray = {-2, 34, 679, -90};
        System.out.println(Arrays.toString(descendingOrder(myArray)));
    }
    public static int[] descendingOrder(int [] param1){
        for (int i = 0; i < param1.length; i++) { //we create one for loop starts with 0 ends with param1.length
            for (int j = i + 1; j < param1.length; j++) { //then we create nested for loop starts with i+1 ends with param1.length
                //because we want to compare one index with the others in every circle
                int temp = 0; //then we create int temp equal 0 to use later on
                if (param1[i] < param1[j]) { //then we create if condition if param1[i] smaller than param1[j]
                    temp = param1[i]; //we assign param1[i] to temp
                    param1[i] = param1[j];// and we assign param1[j] to param1[i]
                    param1[j] = temp;// then we assign temp to param1[j]
                }
            }
        }return param1; //at the end we return param1
    }
}
