import java.util.Scanner;

public class twoInts {

    /* 
    Write a program that reads two integers, start and end, and prints the first number in the inclusive range that is divisible by both 3 and 5.
Requirements
- Use a loop and conditional statements.
- Search from start to end, including both boundaries.
- If no qualifying number exists, print Not found.
- If start > end, print Invalid range.
- Do not use arrays or collections.
    */
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();

        if(start>end)
            System.out.println("Invalid range");

        for(int i=start; i<=end; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("Not found");
    }
}
