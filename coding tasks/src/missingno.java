public class missingno {

    public static int findMissingNumber(int[] inputArray) {
        int n = inputArray.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            actualSum += inputArray[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(findMissingNumber(inputArray));  

    }
}