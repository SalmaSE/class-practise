package test;

public class Employee {

    // Fields (attributes)
    private String name;
    private int id;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Getter and Setter methods (encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary =salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 101, "Engineering", 75000.00);

        // Display the employee details
        emp.displayEmployeeDetails();
    }
}
