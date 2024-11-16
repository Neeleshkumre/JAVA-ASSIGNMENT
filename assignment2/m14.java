import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    double basicSalary, grossSalary;
    Employee(int empId, String empName, double basicSalary) {
        this.empId = empId; this.empName = empName; this.basicSalary = basicSalary;
        this.grossSalary = basicSalary + (0.2 * basicSalary) + (0.1 * basicSalary);
    }
    void display() { System.out.println(empId + " " + empName + " Gross Salary: " + grossSalary); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt(); String name = sc.next(); double salary = sc.nextDouble();
        Employee emp = new Employee(id, name, salary);
        emp.display();
    }
}
