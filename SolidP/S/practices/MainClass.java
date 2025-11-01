package SolidP.S.practices;

public class MainClass extends MyAbstractCl implements MyInterface{
    public static void main(String... nitin){
        MyAbstractCl obj = new MainClass();  // polymorphism
        obj.m1();
    }

    @Override
    public void m1() {
        System.out.println("Implemented in MainClass");
    }

    @Override
    public String run() {
       return "Nitin";
    }
}
