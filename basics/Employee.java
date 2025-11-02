package basics;

public class Employee {
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public Employee() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
