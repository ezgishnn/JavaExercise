package Arrays;

import java.util.Arrays;

public class HowToAddMaxAndMinValueInArray {
    public static void main(String[] args) {
        int [] array = {34, 1, -9, 89, 55, 78, 41};
        System.out.println(maxValue(array));
        System.out.println(minValue(array));
        int maxValue = maxValue(array);
        int minValue = minValue(array);
        int [] newArray = new int[2];
        newArray [0] = maxValue;
        newArray [1] = minValue;
        System.out.println(Arrays.toString(newArray));
    }
    public static int maxValue(int [] param1){
        int max = param1[0];
        for (int i = 0; i < param1.length; i++) {
            if (max < param1[i]){
                max = param1[i];
            }
        }
        return max;
    }
    public static int minValue(int [] param1){
        int min = param1[0];
        for (int i = 0; i < param1.length; i++) {
            if (min > param1[i]){
                min = param1[i];
            }
        }
        return min;
    }
}

