import java.util.Scanner;

/*
Parking duration	Rate
First 2 hours	₹30 per hour
Next 3 hours (hours 3–5)	₹20 per hour
Every hour above 5	₹10 per hour 
Requirements
- Read an integer hours.
- Calculate the total charge using progressive rates.
- If hours <= 0, print Invalid input.
- Assume the duration is always a whole number of hours.
*/
public class parkingFeeCalculation {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int hours = s.nextInt();
        int total = 0;
        if (hours<=0){
            System.out.println("Invalid input");
            return;
        } else if(hours <= 2) 
            total = hours*30;
        else if(hours<=5)
            total = (2*30) + ((hours-2)*20); 
        else
            total = (2*30) + (3*20) + ((hours-5)*10);

        System.out.println(total);

        s.close();
    }
}
