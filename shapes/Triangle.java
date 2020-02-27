package geometry.shapes;

public class Triangle extends Shape {
    protected Float a;
    protected Float b;
    protected Float c;
    protected String name;
    
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = "Triangle";
    }

    public double calculateArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public String getAreaFormula() {
        return "sqrt(s(s-a)(s-b)(s-c)) where s=(a+b+c)/2";
    }

    public String getPerimeterFormula() {
        return "a + b + c";
    }

    public String toString() {
        String label = String.format("%s, a = %.2f, b = %.2f, c = %.2f", name, a, b, c);
        return label;
    }

    public String getName() {
        return name;
    }
}
