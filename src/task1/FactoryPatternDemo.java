package task1;

/**
 * created by eseisl on 31.10.2020
 */

public class FactoryPatternDemo {


    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //Получить экземпляр класса Circle и вызвать его метод
        Shape shape1 = shapeFactory.getShape("circle");
        //вызвать метод рисования круга
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("circle");
        shape4.draw();
    }
}
