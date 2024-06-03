import java.lang.Math;
enum EnumFigures {
    TRIANGLE ("triangle", 2) { String triangle = "high";},
    CIRCLE ("circle",1) { String circle = "radius";},
    SQUARE ("square",1) { String square = "side";};

    private String form;
    private int order;

    EnumFigures (String form, int order) {
        this.form = form;
        this.order = order;
    }

    public String getForm (){ return form; }
    public int getOrder (){ return order; }

    public float areaFormula ( float paramValue, float area ) {
        switch (this) {
            case TRIANGLE : {
                area = paramValue * paramValue / 2;
                break;
            }
            case CIRCLE :
            case SQUARE : {
                area = paramValue * paramValue;
                break;
            }
        }
        return area;
    }
    public float maxParamCapacityValue (EnumFigures insideFigure, float paramValue) {
        switch (this) {
            case TRIANGLE :
                switch (insideFigure) {
                    case TRIANGLE:
                        return paramValue;
                    case CIRCLE:
                        return paramValue / 3;
                    case SQUARE:
                        return 2 * paramValue / 2 + (float) Math.sqrt(3);
                }
            case CIRCLE:
                switch (insideFigure) {
                    case TRIANGLE : return 3 * paramValue / 2;
                    case CIRCLE : return paramValue;
                    case SQUARE : return paramValue * (float) Math.sqrt(2);
                }
            case SQUARE:
                switch (insideFigure) {
                    case TRIANGLE : return paramValue * (float) Math.sqrt(3) / 2;
                    case CIRCLE : return paramValue / 2;
                    case SQUARE : return paramValue;
                    }
                System.out.println("inside figure param " + paramValue + "check figure param \n");
        }
        return 0.0f;
    }
}

