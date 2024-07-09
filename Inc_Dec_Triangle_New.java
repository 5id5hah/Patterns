public class Inc_Dec_Triangle_New {
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int n){
        for (int row = 0; row < 2*n; row++) {
            int colsearch = row > n ? 2*n -row : row;
            for (int col = 0; col <colsearch; col++) {
                System.out.print(" * ");

            }
            System.out.println(" ");
        }
    }
}
