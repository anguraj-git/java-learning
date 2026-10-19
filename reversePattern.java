import java.util.Scanner;

public class pattern {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //5
        for(int i=n; i>0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
