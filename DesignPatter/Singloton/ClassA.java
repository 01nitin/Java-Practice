package DesignPatter.Singloton;

public class ClassA {
    public static ClassA a;
    private ClassA () {}

    public static ClassA getA(){
        synchronized(ClassA.class){
            if ( a == null){
                for(int i = 0 ; i< 1000; i ++){
                    System.out.print(i + " ");
                }
                System.out.println(" ");
                a =  new ClassA();
            }
        }

        return a;
    }
}
