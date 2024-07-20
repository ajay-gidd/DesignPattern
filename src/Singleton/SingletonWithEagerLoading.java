package Singleton;

public class SingletonWithEagerLoading {

    private static SingletonWithEagerLoading singletonWithEagerLoading = new SingletonWithEagerLoading();

    private SingletonWithEagerLoading(){}

    public static SingletonWithEagerLoading getInstance(){
        return singletonWithEagerLoading;
    }
}
