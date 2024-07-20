package Singleton;

public class SingletonWithLazyLoading {

    private static SingletonWithLazyLoading singletonWithLazyLoading = null;

    private SingletonWithLazyLoading(){}

    public static SingletonWithLazyLoading getInstance(){

        if(singletonWithLazyLoading == null)
        {
            singletonWithLazyLoading = new SingletonWithLazyLoading();
        }
        return singletonWithLazyLoading;
    }
}
