package DesignPatter.FactoryDesignP;

public class FrontDev implements Employee{

    public int salary(){
        return 40000;
    }

    @Override
    public String name() {
        return "Pandey";
    }
}
