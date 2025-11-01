package DesignPatter.Singloton;

public class Main {
    public  static void main(String... args){
        ClassA a = ClassA.getA();
        System.out.println(a);

        ClassA b = ClassA.getA();
        System.out.println(b.hashCode());

        ClassA c = ClassA.getA();
        System.out.println(c.hashCode());
    }
}
