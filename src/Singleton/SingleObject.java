package Singleton;

/**
 * created by eseisl on 01.11.2020
 */

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        if (instance == null) {
            instance = new SingleObject();
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("This is singleton!");
    }
}
