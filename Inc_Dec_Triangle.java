public class Inc_Dec_Triangle {
    public static void main(String[] args) {
        Pattern(8);
    }
    static void Pattern(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");

            }
            System.out.println(" ");
        }

     for (int i = n; i > 0; i--) {
        for (int j = 1; j < i; j++) {
            System.out.print(" * ");

        }
        System.out.println(" ");
    }
   }}




