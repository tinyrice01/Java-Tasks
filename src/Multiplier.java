public class Multiplier {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0;
        System.out.println("1");
        for (int x = 1; i<9; i++) {
            array[i] = x * 2;
            x *= 2;
            System.out.println(array[i]);
        }
    }
}
