package SolidP.S.practices;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Generic extends Throwable {
    public static  void main(String[] a) throws ArithmeticException, IOException {
        ArrayList  list = new ArrayList();
        list.add("Nitin ");
        list.add(123);
        list.add(12.234);

        Object o = list.get(0);
        for(Object l : list){
            String s = l.toString();
            System.out.println(s);
        }


    }
}
