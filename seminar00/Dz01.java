import java.util.Scanner;

public class Dz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the first number > ");
        int num1 = sc.nextInt();
        int num2 = -1;

        while (num2 != 0) {
            System.out.println("Enter the next number? > ");
            num2 = sc.nextInt();
            if (isNumberPositive(num1, num2)) {
                sum += num1;
            }
            num1 = num2;
        }
        System.out.println("Sum = " + sum);
    }

    /**
     * @apiNote Checks if number is valid.
     * @param a previous number.
     * @param b next number.
     * @return is previous number less than 0 and next number
     *         is greater or equal 0
     */
    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
