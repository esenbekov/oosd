package AbstractFactory;

/**
 * created by eseisl on 01.11.2020
 */

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }else {
            throw new RuntimeException(shapeType +" is unknown shape.");
        }
    }
}
