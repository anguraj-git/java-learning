import java.util.Scanner;

// Units consumed	Rate per unit
// First 100 units	₹2
// Next 100 units (101–200)	₹3
// Above 200 units	₹5
public class ebBillCalculation {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int units = s.nextInt();
        int total = 0;
        if (units<0)
            System.out.println("Invalid input");
        else if(units <= 100) 
            total = units*2;
        else if(units<=200)
            total = (100*2) + ((units-100)*3); 
        else
            total = (100*2) + (100*3) + ((units-200)*5);

        System.out.println(total);

        s.close();
    }
}
