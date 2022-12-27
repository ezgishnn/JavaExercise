package Arrays;

import java.util.Arrays;

public class AverageOfNumbersInArrays {
    public static void main(String[] args) {
        int [] a = {2, 5, 98, 6, -33, 5098};
        System.out.println(averageNumbers(a));
    }
    public static float averageNumbers(int[] param1){ //we need to assign one int[] parameter to the method first
        int sum = 0; //in method we should create int sum = 0; to use later on
        for (int i = 0; i < param1.length; i++) { //then we create a for loop starts from 0 ends with param1.length
            sum = sum + param1[i]; //then we add every param1[i] to the sum
        }
        float ave = (float)sum / param1.length; //then we create float average equal int sum division param1.length
        //we create float average because average number might be decimal number also we should change int sum to float sum
        return ave; //at the end we return average
    }
}
