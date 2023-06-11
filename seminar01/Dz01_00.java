import static java.lang.Math.sqrt;

public class Dz01_00 {
    public static void main(String[] args) {
        int[] numsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int sum = 0;
        for (int i = 0; i < numsArray.length; i++) {
            if (validationCheck(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Result = " + sum);
    }

    /**
     * @param a integer number
     * @return number if it's simple
     */
    public static boolean validationCheck(int a) {
        if (a < 2) {
            return false;
        }
        double s = sqrt(a);
        for (int i = 2; i <= s; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
