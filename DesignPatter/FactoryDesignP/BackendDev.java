package DesignPatter.FactoryDesignP;

public class BackendDev implements Employee{
    public int salary(){
        return 150000;
    }

    @Override
    public String name() {
        return "Nitin";
    }


}
