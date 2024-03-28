import java.util.Arrays;

public class RotateArray {
    public static void rotateArray(int[] inputArray, int k) {
        int n = inputArray.length;
        k %= n;
        reverse(inputArray, 0, n - 1);
        reverse(inputArray, 0, k - 1);
        reverse(inputArray, k, n - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(inputArray, k);
        System.out.println(Arrays.toString(inputArray)); 

    }
}
