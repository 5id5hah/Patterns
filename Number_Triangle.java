public class Number_Triangle {
    public static void main(String[] args) {
        Pattern(8);
    }
    static void Pattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}
