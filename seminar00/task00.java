import Java.util.Scanner;

public class task00 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = result(n);
        System.out.println("result = " + (res));
    }
    public static int result(int n) {
        int multi = 1, sum = 0;
        while (n !=  0) {
            multi *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}
