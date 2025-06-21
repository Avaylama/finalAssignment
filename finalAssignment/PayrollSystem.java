class Employee {
    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double performanceBonus;

    public Manager(double baseSalary, double performanceBonus) {
        super(baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + performanceBonus;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp = new Employee(30000);
        Manager mgr = new Manager(50000, 10000);

        System.out.println("Employee Salary: $" + emp.calculateSalary());
        System.out.println("Manager Salary: $" + mgr.calculateSalary());
    }
}
