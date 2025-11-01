package DesignPatter.AbstractFactoryDp;

public class FrontFactoryImpl extends AbstractEmployeeFactory{
    @Override
    Employee createEmployee() {
        return new FrontendEmployee();
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
