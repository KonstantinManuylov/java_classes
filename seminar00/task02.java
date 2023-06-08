import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newString = "qwertyuiopp";
        System.out.println(result(newString));
    }
    public static String result(String str) {
        String subStr1 = newString.substring(0, newString.length / 2);
        String subStr2 = newString.substring(newString.length / 2);
        return subStr2 + subStr1;
    }
}
