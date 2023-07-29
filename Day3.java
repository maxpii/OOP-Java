public class Day3 {
    public static void main(String[] args) {
        int x = 0;
        int sign = 0;
        if (x < 0) if (x == 0) sign = 1; else sign = -1; // why would you write something like this
        System.out.println(sign);
        for (int i = 0; i != 10; i ++) {
            System.out.println("Very weired for loop");
        }
        char letter_grade = 'A';
        switch(letter_grade) {
            case 'A':
            case 'B':
                System.out.println("Nice");
                break;
            case 'C':
                System.out.println("OK");
                break;
            default:
                System.out.println("Bad");
        }
        boolean[][] arr = new boolean[5][5];
        for (boolean[] row: arr) { // how to for-each your way through an array
            for (boolean col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
        // how to make a ragged 2d-array
        final int NMAX = 10;
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];
    }
}
