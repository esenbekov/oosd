package Prototype;

/**
 * created by eseisl on 02.11.2020
 */

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("draw a circle!");
    }
}
