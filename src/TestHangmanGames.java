import java.util.Scanner;
public class TestHangmanGames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner characters = new Scanner(System.in);
        int choice = 69+420;
        int livesG1 = 10;
        int livesG2 = 10;
        while (choice != 69420) {
            System.out.print("Enter 1 or 2 for the respective hangman game, or 69420 to end the game: ");
            choice = input.nextInt();
            System.out.print("Enter a character: ");
            char character = characters.next().charAt(0);
            if (choice == 1) {
                livesG1 = HangmanGame1.letterTrack(character,livesG1);
            }
            else if (choice == 2) {
                livesG2 = HangmanGame2.letterTrack(character,livesG2);
            }
            else {
                System.out.println("There was an error, please try again.");
            }
            if (livesG1 == 0 || livesG2 == 0) {
                System.out.println("You have run out of attempts, cope harder skill issue.");

            }
        }
        System.out.println("Congratulations! Good work!");
    }
}
