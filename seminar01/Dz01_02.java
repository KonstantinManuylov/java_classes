import java.util.Arrays;

public class Dz01_02 {
    public static void main(String[] args) {
        int[] baseArray = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        System.out.println("Base array = " + Arrays.toString(baseArray));
        int sumIndexes = findSumOfTwoDigitsIndex(baseArray);
        int[] newArray = changedArray(baseArray, sumIndexes);
        System.out.println("Changed array = " + Arrays.toString(newArray));
    }

    public static int findSumOfTwoDigitsIndex(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 9 && arr[i] < 100) || (arr[i] < -9 && arr[i] > -100)) {
                res += i;
            }
        }
        return res;
    }

    public static int[] changedArray(int[] arr, int indexesSum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = indexesSum;
            }
        }
        return arr;
    }
}
