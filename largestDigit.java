import java.util.Scanner;

public class largestDigit {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(); //128345
        if(num<0)
            System.out.println("Invalid input");
        int largest = 0;
        while (num % 10 != 0) {
            largest = largest > num % 10 ? largest : num % 10;
            num /= 10;
        }
        System.out.println(largest);
        s.close();
    }
}
