package Arrays;

import java.util.Arrays;

public class HowToAdding2ArraysToOneArray {
    public static void main(String[] args) {
        int [] myArray = {2, 45, 67, 89, 222,};
        int [] myArray2 = {23, 90, 78, 67, 56, 49087654};
        System.out.println(Arrays.toString(addingArray(myArray, myArray2)));
    }
    public static int[] addingArray(int[] param1, int[] param2){//in order to combine two Arrays we create our method with two int[] parameters
        int[] array3 = new int[param1.length + param2.length];//then we create a new array with the size of param1 + param2
        for (int i = 0; i < param1.length; i++) { //then we create a for loop starts with 0 ens with param1.length
            array3[i] = param1[i];        //we assign param1[i] to new array[i]
        }
        int k = 0;                      //before creating another for loop we create int k = 0 in order to use later
        for (int i = param1.length; i < array3.length; i++) { //then we write another for loop starts with param1.length ends with new array.length
            array3 [i] = param2[k];//then we assign param2[k] to new array[i] (we assign to new array[i] because we would like to continue where we left in the first array)
            k++;    //then we increase the k by one
        }
        return array3; //then we return new array
    }
}
