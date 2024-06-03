import java.util.List;
import java.util.stream.Stream;

public class Triangle extends Figure {

    public Triangle (EnumFigures figureType, float paramValue) {
        super(figureType, paramValue);
    }

    @Override
    public String toString () {
        return Stream.of("Figure type is " + figureType.getForm(),
                "Param value of " + figureType.getForm() + " is " + getParam(),
                "Area of " + figureType.getForm() + " is " + area).toList() + "\n";
    }
}