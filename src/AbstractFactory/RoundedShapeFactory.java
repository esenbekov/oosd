package AbstractFactory;

/**
 * created by eseisl on 01.11.2020
 */

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new RoundedSquare();
        }else {
            throw new RuntimeException(shapeType +" is unknown roundedShape.");
        }
    }
}
