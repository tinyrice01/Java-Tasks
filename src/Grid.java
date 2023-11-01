public class Grid {
    public static void main(String[] args) {
        int[] array = new int[6];
        int i = 0;
        System.out.println("---------------");
        for (int x = 0; i<3; i++) {
            array[i] = x;
            System.out.print(" | "+array[i]);
            x ++;
        }
        System.out.println(" |");
        System.out.println("---------------");
        for (int x = 3; i<6; i++) {
            array[i] = x;
            System.out.print(" | "+array[i]);
            x ++;
        }
        System.out.println(" |");
        System.out.println("---------------");
    }
}
