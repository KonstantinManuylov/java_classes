import java.util.Scanner;

public class Dz00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = sc.nextLine().trim();
        String[] words = input.split(" ");
        String newWords = ReversedArray(words);
        System.out.println("Результат: " + newWords);
    }

    /**
     * @param a Array with strings (words)
     * @return The string with reverced sentence.
     * @apiNote https://leetcode.com/problems/reverse-words-in-a-string/
     */
    public static String ReversedArray(String[] text) {
        String outText = "";
        for (int i = text.length - 1; i >= 0; i--) {
            outText += text[i] + " ";
        }
        return outText;
    }
}
