package Singleton;

/**
 * created by eseisl on 01.11.2020
 */

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
