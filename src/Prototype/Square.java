package Prototype;

/**
 * created by eseisl on 02.11.2020
 */

public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("draw a square!");
    }
}
