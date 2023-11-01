public class Challenge {
    public static void main(String[] args) {
        // two-sum, find all number that add to the target var, and then print out the result and works in possable
        int target = 14;
        int[] possable = new int[]{2, 37, 3, 11, 7, 7, 23, 5432, 45, 234, 56, 46, 7, 4567, 5, 6, 5, 5, 3, 54, 6, 54, 654, 45, 55, 56, 66, 54445, 55, 565, 4, 5, 45, 34, 64, 56, 43};
        for (int i = 0; i < possable.length; i++) {
            for (int j = 0; j < possable.length; j++) {
                if (i == j) {
                    break;
                }
                else if (possable[i] + possable[j] == target) {
                    System.out.println(possable[i]+"+"+possable[j]+"="+target);
                }
                else if (possable[i] - possable[j] == target) {
                    System.out.println(possable[i]+"-"+possable[j]+"="+target);
                }
                else if (possable[j] - possable[i] == target) {
                    System.out.println(possable[j]+"-"+possable[i]+"="+target);
                }
            }
        }
    }
}