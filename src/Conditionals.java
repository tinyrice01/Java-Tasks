import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1 = input.nextLine();
        System.out.println("The word you entered was: "+word1);
        System.out.print("Enter another word: ");
        String word2 = input.nextLine();
        System.out.println("The word you entered was: "+word2);
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("You entered the same word twice.");
        }
        else System.out.println("You didn't enter the same word twice");
    }
}
