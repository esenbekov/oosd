package Prototype;

/**
 * created by eseisl on 02.11.2020
 */

public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("draw a rectangle!");
    }
}
