public class Numerical_Square {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int index = Math.min(Math.min(row,col),Math.min(n - row, n - col));
                System.out.print(index + " ");
            }
            System.out.println();

        }
    }
}
