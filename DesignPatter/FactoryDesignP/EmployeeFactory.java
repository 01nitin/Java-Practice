package DesignPatter.FactoryDesignP;

public class EmployeeFactory {
    public Employee getEmployee(String empType){
        if (empType.equals("Back")){
            return new BackendDev();
        } else if (empType.equals("Front")) {
            return new FrontDev();
        }
        return null;
    }
}
