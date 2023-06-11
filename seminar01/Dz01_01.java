public class Dz01_01 {
    public static void main(String[] args) {
        int[] ascendingArray = {1, 2, 3, 4, 5};
        int[] notAscendingArray = {1, 3, 2, 4, 5};
        boolean isAsc = isAscending(ascendingArray);
        boolean isNonAsc = isAscending(notAscendingArray);
        System.out.println(isAsc);
        System.out.println(isNonAsc);
    }
    /**
     * @param arr numbers array
     * @return is array's numbers are in raising position
     */
    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
