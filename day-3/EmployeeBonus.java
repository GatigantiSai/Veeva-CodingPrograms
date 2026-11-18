import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return 0;
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.15;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        String name = sc.next();
        double salary = sc.nextDouble();

        Employee e;

        if (type.equals("M")) {
            e = new Manager(name, salary);
        } else {
            e = new Developer(name, salary);
        }

        System.out.println(e.name);
        System.out.printf("%.2f", e.calculateBonus());

        sc.close();
    }
}
