package Singleton;

public class SingletonWithSynchronization {

    private static SingletonWithSynchronization singletonWithSynchronization = null;

    private SingletonWithSynchronization(){}

    public static SingletonWithSynchronization getInstance(){
        if(singletonWithSynchronization == null){
            synchronized (SingletonWithSynchronization.class){
                if(singletonWithSynchronization == null)
                {
                    singletonWithSynchronization = new SingletonWithSynchronization();
                }
            }
        }
        return singletonWithSynchronization;
    }
}
