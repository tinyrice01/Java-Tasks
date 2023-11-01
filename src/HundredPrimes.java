import java.util.Scanner;
class HundredPrimes {
    public static void main(String[] args) {
        int n = 100;
        int status = 1;
        int num = 3;
        int[] HundredPrimes = new int[100];
        HundredPrimes[0] = 2;
        int counter = 1;

        for (int i = 2 ; i <=n;) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if (num%j == 0) {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ) {
                HundredPrimes[counter] = num;
                counter++;
                i++;
            }
            status = 1;
            num++;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1-100: ");
        int number = input.nextInt();
        if ((number >= 1) && (number <=100))
            System.out.println(HundredPrimes[(number-1)]);
        else System.out.println("There was an error, please try again.");
    }
}