package SolidP.S.practices;

public interface MyInterface {
    default void m1(){
        System.out.println("Nitin Pandey of interface");
    }
    abstract String run();
}
