package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main extends  Exception{
    public static void main(String[] a) {
        List<Employee> list = new ArrayList<>();
        Employee e = new Employee();
        e.setName("Nitin");
        e.setSalary(15000);

        Employee e1 = new Employee();
        e1.setName("Pandey");
        e1.setSalary(16000);

        Employee e2 = new Employee();
        e2.setName("NitinPandey");
        e2.setSalary(17000);

        Employee e3 = new Employee();
        e3.setName("anmol");
        e3.setSalary(18000);

        list.add(e);
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Optional<Employee> sec = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();


        Employee emp = null;
        if (sec.isPresent()){
            emp = sec.get();
            int salary = emp.getSalary();
            String name = emp.getName();
            System.out.println(salary);
            System.out.println(name);
        }

        System.out.println("end");

    }
}
