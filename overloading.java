public class Overloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * 2 integers: 15
         * 3 integers: 60
         * 2 decimals: 7.5
         * Array sum: 100
         */
        Overloading ol = new Overloading();
        System.out.println("2 integers: " + ol.add(10, 5));
        System.out.println("3 integers: " + ol.add(10, 5, 45));
        System.out.println("2 decimals: " + ol.add(5.0, 2.5));
        System.out.println("Array sum: " + ol.add(new int[] { 1, 2, 3, 94 }));
    }
}
