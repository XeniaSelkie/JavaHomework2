import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 4, 2, 1};
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped) {
                System.out.println("After iteration " + (i+1) + ": " + Arrays.toString(arr));
            }
        }
        System.out.println("Final sorted array: " + Arrays.toString(arr));
    }
}

