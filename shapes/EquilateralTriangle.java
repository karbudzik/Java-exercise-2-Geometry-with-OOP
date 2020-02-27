package geometry.shapes;

public class EquilateralTriangle extends Triangle {
        
    public EquilateralTriangle(float a) {
        super(a, a, a);
        this.name = "Equil. Triangle";
    }

    @Override
    public String getAreaFormula() {
        return "(sqrt(3)/4) * (a^2)";
    }

    @Override
    public String getPerimeterFormula() {
        return "3 * a";
    }

    @Override
    public String toString() {
        String label = String.format("%s, a = %.2f", name, a);
        return label;
    }
}
