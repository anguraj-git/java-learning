import java.util.Scanner;

public class digitCounter {
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //106 , 0
        int count = 0;
        int total = 0;
        if (n<0) {
            System.out.println("Invalid input");
        } else{
                do {
                    count++;
                    total = total + n%10;
                    n /= 10;
                } while(n>0);
        }
        System.out.println("Digits: " + count);
        System.out.println("Sum: " + total); 
    }
}
