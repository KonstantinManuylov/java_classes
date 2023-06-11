public class task01 {
    public static void main(String[] args) {
        int baseNum = 2;
        int powNum = 10;
        int res = findPow(baseNum, powNum);
        System.out.println("Результат = " + res);
    }
    /**
     * @param a Base int number
     * @param n Power int number
     * @return int a powered with n
     */
    public static int findPow(int a, int n) {
        int constantNum = a;
        for (int i = 1; i < n; i++) {
            a *= constantNum;
        }
        return a;
    }
}
