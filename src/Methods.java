import java.util.Scanner;
public class Methods {
    public static boolean Method(String word1, String word2) {
        if (word1.equalsIgnoreCase(word2)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1 = input.nextLine();
        System.out.print("Enter another word: ");
        String word2 = input.next();
        if (Method(word1, word2)) System.out.println("The words are the same.");
        else System.out.println("The words are not the same.");
    }
}
