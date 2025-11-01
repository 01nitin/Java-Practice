package DesignPatter.AbstractFactoryDp;

public class FrontendEmployee implements Employee{

    public int getSalary(){
        return 15000;
    }
    public String getName(){
        return "Frontend Dev";
    }
}
