
import java.util.Scanner;

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        double newSalary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);

        e.setSalary(newSalary);

        System.out.printf("%.2f", e.getSalary());

        sc.close();
    }
}
