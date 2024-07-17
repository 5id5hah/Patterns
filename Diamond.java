public class Diamond {
    public static void main(String[] args) {
        Pattern(4);
    }
    static void Pattern(int n){
        for (int row = 0; row < 2*n; row++) {
            int colsearch = row > n ? 2*n -row : row;

            int nospaces = n - colsearch;
            for (int i = 0; i < nospaces; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col <colsearch; col++) {
                System.out.print("❤ ");

            }
            System.out.println(" ");
        }
    }
}
