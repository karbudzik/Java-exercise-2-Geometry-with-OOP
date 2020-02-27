package geometry.shapes;

public class Rectangle extends Shape {

    protected Float a;
    protected Float b;
    protected String name;
    
    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
        this.name = "Rectangle";
    }

     public double calculateArea() {
        return a * b;
    }

    public double calculatePerimeter() {
        return (2 * a) + (2 * b);
    }

    public String getAreaFormula() {
        return "a * b";
    }
    
    public String getPerimeterFormula() {
        return "2a + 2b";
    }

    public String toString() {
        String label = String.format("%s, a = %.2f, b = %.2f", name, a, b);
        return label;
    }

    public String getName() {
        return name;
    }

}
