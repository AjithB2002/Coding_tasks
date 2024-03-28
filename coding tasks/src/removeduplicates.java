

public class removeduplicates {
    public static int removeDuplicates(int[] inputArray) {
        if (inputArray.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < inputArray.length; j++) {
            if (inputArray[i] != inputArray[j]) {
                i++;
                inputArray[i] = inputArray[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(inputArray);
        System.out.println("New Length: " + newLength);   
    }
}