package Arrays;

import java.util.Arrays;

public class c1MaxValueInArray {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] array = {34, 1, -9, 89, 55, 78, 41};
        System.out.println(maxValue(array));
    }
        public static int maxValue ( int[] param1){ //we should add one int[] parameter to the method
            int max = param1[0]; //then we have to assign int max to one of the index of array
            for (int i = 0; i < param1.length; i++) { //then we create a for loop
                if (max < param1[i]) { //if max number smaller than the param1 index[i] number
                    max = param1[i]; //we assign bigger number to max number
                }
            }
            return max; //at the end we return max number
        }

    }
