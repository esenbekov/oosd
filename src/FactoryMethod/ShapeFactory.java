package FactoryMethod;

/**
 * created by eseisl on 31.10.2020
 */

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        } else {
            throw new RuntimeException(shapeType +" is unknown shape.");
        }
    }
}
