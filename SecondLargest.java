// public class SecondLargest {
//     public static void main(String[] ars) {
//         int[] arr = {12, 5, 8, 12, 3, 10, 1
//                 int l argest = Integer.MIN_VALUE ;

//         int second = Integer.MIN_VALUE;
//         for (int i=0; i<arr.length; i++) {
//             if(arr[i]>largest) {
//                 second = largest;
//                 largest = arr[i];
//             } else if(arr[i] != largest && arr[i] > second) {
//                 second = arr[i];
//             }
//         }
//         System.out.println(second);
//     }
// }

//     Create an Employee

//     class with:-id,name,
//     and salary as private fields.-
//     A parameterized constructor.-
//     A getter for salary.-
//     A method
//     to increase
//     salary by
//     a percentage.-
//     Reject negative
//     salary increments.
//     Then write
//     code to
//     create an
//     array of
//     three employees
//     and print
//     the employee
//     with the
//     highest salary.

class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage < 0) {
            System.out.println("Cannot negatively increase the salary");
            return;
        }
        salary += salary * (percentage / 100);
    }

    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    public boolean isPalindrome(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        return str.equals(sb.toString());
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("123", "Kum", 1000);
        employees[1] = new Employee("124", "Jon", 2000);
        employees[2] = new Employee("125", "Unn", 3000);

        Employee highPaid = null;
        for (Employee e : employees) {
            if (e.getSalary() > highPaid.getSalary())
                highPaid = e;
        }
        System.out.println(highPaid.toString());

    }
}
