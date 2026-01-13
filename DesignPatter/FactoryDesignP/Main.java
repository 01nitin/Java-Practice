package DesignPatter.FactoryDesignP;

public class Main {
    public static  void main(String[] a){
        EmployeeFactory e = new EmployeeFactory();
        Employee back = e.getEmployee("Back");
        System.out.println(back.name());
    }
}
