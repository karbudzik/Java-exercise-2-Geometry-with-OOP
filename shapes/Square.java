package geometry.shapes;

public class Square extends Rectangle {

    public Square(float a) {
        super(a, a);
        this.name = "Square";
    }

    @Override
    public String getAreaFormula() {
        return "a * a";
    }
    
    @Override
    public String getPerimeterFormula() {
        return "4a";
    }

    @Override
    public String toString() {
        String label = String.format("%s, a = %.2f", name, a);
        return label;
    }
}