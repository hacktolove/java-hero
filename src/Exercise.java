
public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        // TODO: Print their details using getDetails()
        Employee myEmp = new Employee("Alice" , 50000.0);
        Employee myMan = new Manager("Bob" , 80000.0 , "IT");

        System.out.println(myEmp.getDetails());
        System.out.println(myMan.getDetails());

    }
}


class Employee {
    private String name;
    private double salary;

    public Employee(String name , double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String  getName() {
        return this.name;
    }
    public double  getSalary() {
        return this.salary;
    }

    public String getDetails() {
        return "Name: " + this.name + ", Salary: " + this.salary;
    }
}


class Manager extends Employee {
    private String department;

    public Manager(String name , double salary , String department) {
        super(name , salary);
         this.department = department;
    }

    public String getDetails() {
        return "Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Department: " + this.department;
    }
}