public class Diamond_Numbers {
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int n){
        for (int row = 1; row <= 2 * n ; row++) {

            int c = row > n ? 2*n -row : row;

            for (int spaces = 0; spaces < n - c; spaces++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");

            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");

        }

    }
}
