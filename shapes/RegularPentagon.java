package geometry.shapes;

public class RegularPentagon extends Shape {
    private Float a;
    private String name;
    
    public RegularPentagon(float a) {
        this.a = a;
        this.name = "Regular Pentagon";
    }

     public double calculateArea() {
        return (a*a*Math.sqrt(5*(5+2*Math.sqrt(5))))/4;
    }

    public double calculatePerimeter() {
        return 5 * a;
    }

    public String getAreaFormula() {
        return "(a2 sqrt(5(5+2sqrt(5))))/4";
    }
    
    public String getPerimeterFormula() {
        return "5a";
    }

    public String toString() {
        String label = String.format("%s, a = %.2f", name, a);
        return label;
    }

    public String getName() {
        return name;
    }
}

