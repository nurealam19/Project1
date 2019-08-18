package polymorphism.OOP;

public class Employee {
    String empFirstName;
    String empLastName;
    String job;
    double salary;
    int empId;

    public Employee(){}

    public Employee(String empFirstName, String empLastName, String job, double salary, int empId) {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.job = job;
        this.salary = salary;
        this.empId = empId;
    }

    public Employee(String job, double salary, int empId) {
        this.job = job;
        this.salary = salary;
        this.empId = empId;
    }

    public Employee(String empFirstName, String empLastName, String job) {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.job = job;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
