import java.util.Objects;
import java.util.StringJoiner;

public class Figure {
    EnumFigures figureType;
    private float paramValue;
    float area;

    //constructor, param > 0
    public Figure (EnumFigures figureType, float paramValue){
        System.out.println(this.figureType=figureType);
        System.out.println("___________");

        if (paramValue > 0.0f)
            this.paramValue = paramValue;
        else {
            System.out.println("Inside " + figureType.getForm() + " figure param <=0 \n");
            return;
        }
        calculateFigureArea();
        System.out.println(this);
    }

    public float getParam () { return paramValue; }

    public int hashcode() {
        int result = 31 * System.identityHashCode(figureType);
        result = 31 * System.identityHashCode(paramValue) + result;
        return result;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        Figure figure = (Figure) obj;
        return figureType == figure.figureType && paramValue == figure.paramValue;
    }

    @Override
    public String toString () {
        return new StringJoiner("\n")
                .add("Figure type is " + figureType.getForm())
                .add("Param value of " + figureType.getForm() + " is " + paramValue)
                .add("Area of " + figureType.getForm() + " is " + area)
                .add("")
                .toString();
    }

    public void calculateFigureArea () { area = figureType.areaFormula(paramValue, area);}

    public boolean checkCapacity (Figure figure) {
        System.out.println("Checking capacity for " + this.figureType + " and " + figure.figureType);

        float maxParam = this.figureType.maxParamCapacityValue(figure.figureType, figure.getParam());
        System.out.println("Inside " + figure.figureType.getForm() + " param = " + figure.getParam());
        System.out.println("Checking " + figure.figureType.getForm() + " param = " + maxParam);

        if (maxParam != 0.0f) {
            if (figure.getParam() >= maxParam) {
                System.out.println(this.figureType.getForm() + "contains " + figure.figureType.getForm() + "\n");
                return true;
            }
            else {
                System.out.println(this.figureType.getForm() + "not contains " + figure.figureType.getForm() + "\n");
                return false;
            }
        }
        System.out.println("smth wrong! \n");
        return false;
    }
}
