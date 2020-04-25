package creational.singleton;

public class DriverClass {

    public static void main(String []args){
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);

        SingletonClass anotherINstance = SingletonClass.getInstance();
        System.out.println(anotherINstance);
    }
}
