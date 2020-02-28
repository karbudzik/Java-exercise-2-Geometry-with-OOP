package shapes;

public class Circle extends Shape {

    private Float r;
    private String name;
    
    public Circle(float r) {
        this.r = r;
        this.name = "Circle";
    }

    public double calculateArea() {
        return Math.PI * r * r;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    public String getAreaFormula() {
        return "π*r*r";
    }
    
    public String getPerimeterFormula() {
        return "2*π*r";
    }

    public String toString() {
        String label = String.format("%s, r = %.2f", name, r);
        return label;
    }

    public String getName() {
        return name;
    }
}

