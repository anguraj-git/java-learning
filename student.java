public class Student {

    int rollNumber;
    String name;
    int[] marks;

    public Student(int rollNumber1, String name1, int[] marks1) {
        rollNumber = rollNumber1;
        name = name1;
        marks = marks1.clone();
    }
    // Implement calculateTotal(), calculateAverage(), and displayDetails().

    public int calculateTotal() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    public void displayDetails() {
        System.out.println("Total = " + calculateTotal());
        System.out.println("Average = " + calculateAverage());
    }

    public static void main(String[] args) {
        Student s1 = new Student(001, "Angu", new int[] { 90, 95, 100 });
        Student s2 = new Student(002, "Raj", new int[] { 85, 90, 95 });
        Student s3 = new Student(003, "Ajith", new int[] { 80, 85, 95 });
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        double highestAvg = Math.max(Math.max(s1.calculateAverage(), s2.calculateAverage()), s3.calculateAverage());
        if (s1.calculateAverage() > s2.calculateAverage()
                && s1.calculateAverage() > s3.calculateAverage()) {
            System.out.println("Highest Average student name - " + s1.name);
        } else if (s2.calculateAverage() > s1.calculateAverage() && s2.calculateAverage() > s3.calculateAverage()) {
            System.out.println("Highest Average student name - " + s2.name);

        } else if (s3.calculateAverage() > s1.calculateAverage() && s3.calculateAverage() > s2.calculateAverage()) {
            System.out.println("Highest Average student name - " + s3.name);
        }

        int arr[][] = new int[5][];
    }
}
