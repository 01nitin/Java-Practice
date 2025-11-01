package DesignPatter.AbstractFactoryDp;

import DesignPatter.FactoryDesignP.EmployeeFactory;

public class BackFactoryImpl extends AbstractEmployeeFactory{
    @Override
    Employee createEmployee() {
        return new BackendEmployee();
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
