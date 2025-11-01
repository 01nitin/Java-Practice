package DesignPatter.AbstractFactoryDp;

public class Main {
    public static void main(String... a){
        Employee employee = EmployeeFactory.getEmployee(new BackFactoryImpl());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
