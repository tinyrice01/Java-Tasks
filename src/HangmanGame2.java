public class HangmanGame2 {
    static String answer = "snazzy";
    static String capsAnswer = "SNAZZY";
    static int answerLength = answer.length();
    static char[] blank = new char[answerLength];
    public static int letterTrack(char character, int remainingLives) {
        String status = "no";
        String word = "";
        for (int i = 0; i < answerLength; i++) {
            if (answer.charAt(i) == character || capsAnswer.indexOf(character) == i) {
                blank[i] = character;
                status = "contains";
            }
            System.out.print(blank[i]);
            word += blank[i];
        }
        System.out.println();
        if (status.equals("no")) {
            System.out.println("That was incorrect, please try again.");
            remainingLives -= 1;
            System.out.println("You have " + remainingLives + " lives remaining.");
        }
        if (answer.equalsIgnoreCase(word)) System.out.println("You finished this word!");
        return remainingLives;
    }
}
