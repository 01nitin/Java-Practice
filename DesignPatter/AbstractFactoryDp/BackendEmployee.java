package DesignPatter.AbstractFactoryDp;

public class BackendEmployee implements Employee{

    public int getSalary(){
        return 15000;
    }
    public String getName(){
        return "BackEnd Dev";
    }
}
