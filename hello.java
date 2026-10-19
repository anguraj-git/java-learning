public class hello {
public static void main(String[] args) {
    System.out.println("Hello World!");
    int a =5;
    double b = 5.5;
    System.out.println(b + a);
    byte c = 20;
    System.out.println(c);

    int d = 10_00_00_000;
    System.out.println(d);

    int e = 156;
    System.out.println(e-200);

    c = (byte) e;
    System.out.println(c);

    // e= e-200;
    // System.out.println(271-256);

    // c = (byte) e;
    // System.out.println(c);

    // char f = (char) e;
    // System.out.println(f);

    double g = 5.9597100200;

    float h = (float) g;

    // g = (double) h;
    System.out.println(g);
    System.out.println(h);

    boolean i = true;
    boolean j = false;

    System.out.println(i | j);
}}