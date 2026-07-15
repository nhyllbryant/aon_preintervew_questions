package task2_find_arrays;

public class ArrayFinder {
    public static int findSubArray(int[] arr, int[] subArr) {
        if (subArr.length == 0 || arr.length < subArr.length) {
            return -1;
        }

        for (int i = 0; i <= arr.length - subArr.length; i++) {
            boolean match = true;
            for (int j = 0; j < subArr.length; j++) {
                if (arr[i + j] != subArr[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }
}
