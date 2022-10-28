package array;
import java.util.*;

public class max_min_sum_of_subarray {
    public static void sum_SubArray(int arr[]) {

        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum = currentsum + arr[k];
                    System.out.print( arr[k] + " ");
                }
                System.out.println();
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The maximum sum of sub array is " + maxsum);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = {1,2,3,4,5};
        System.out.println("The array is");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sum_SubArray(arr);
    }
}
