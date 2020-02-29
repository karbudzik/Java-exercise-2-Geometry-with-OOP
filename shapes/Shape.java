package shapes;

public abstract class Shape {
    
    protected String name;
    
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract String getAreaFormula();
    
    public abstract String getPerimeterFormula();

    public abstract String getName();

    public abstract String toString();
}