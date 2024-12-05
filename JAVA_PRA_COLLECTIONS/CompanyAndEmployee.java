import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    // Parameterized constructor
    public  Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for designation
    public String getDesignation() {
        return designation;
    }

    
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Company {
    private String companyName;
    private ArrayList<Employee> employees;
    private int numEmployees;

    // Parameterized constructor
    public Company(String companyName, ArrayList<Employee> employees) {
        this.companyName=companyName;
        this.employees = employees;
        this.numEmployees = employees.size();
    }

    // Method to get average salary
    public double getAverageSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / numEmployees;   
    }

    // Method to get maximum salary
    public double getMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    // Method to get employees by designation
    public ArrayList<Employee> getEmployeesByDesignation(String designation,ArrayList<Employee> al) {
        // ArrayList<Employee> filteredEmployees = new ArrayList<>();
        // for (Employee employee : employees) {
        //     if (employee.getDesignation().equalsIgnoreCase(designation)) {
        //         filteredEmployees.add(employee);
        //     }
        // }
        //return filteredEmployees;

        return (ArrayList<Employee>) al.stream()
               .filter(h->h.getDesignation().equalsIgnoreCase(designation))
               .collect(Collectors.toList());
    }
}

public class CompanyAndEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        // Read company details
        System.out.print("Enter the company name: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        ArrayList<Employee> employees = new ArrayList<>();

        // Read employee details
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employees.add(new Employee(id, name, designation, salary));
        }

        // Create company object
        Company company = new Company(companyName, employees);

        // Display results
        System.out.println("\nAverage Salary: " + company.getAverageSalary());
        System.out.println("Maximum Salary: " + company.getMaxSalary());

        System.out.print("Enter a designation to search employees: ");
        String searchDesignation = scanner.nextLine();
        ArrayList<Employee> filteredEmployees = company.getEmployeesByDesignation(searchDesignation,employees);

        System.out.println("Employees with designation " + searchDesignation + ":");
        for (Employee employee : filteredEmployees) {
            System.out.println(employee);
        }

        scanner.close();
    }
}
