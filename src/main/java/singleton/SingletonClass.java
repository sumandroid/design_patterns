package singleton;

public class SingletonClass {
    private static volatile SingletonClass singletonClass = null; // make singleton class object to bre read and written
    // directly from/to main memory

    private SingletonClass(){
        if(singletonClass != null){
            throw new RuntimeException("Use getInstance"); // avoid getting new instance create using reflection
        }
    }

    public static SingletonClass getInstance(){
        if(singletonClass == null){
            synchronized (SingletonClass.class){ //make getinstance thread safe.
                if(singletonClass == null){
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
