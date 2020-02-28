package shapes;


// import com.codecool.java.NotYetImplementedException;
public abstract class Shape {
    
    //protected String name;
    
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract String getAreaFormula();
    
    public abstract String getPerimeterFormula();

    public abstract String getName();

    public abstract String toString();
    
    /**
     * Check if any of args are not below 0.
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     * param args
     * return true if any of args are greater than 0
     */
    // public static boolean checkIfArgsGreaterThanZero(float... args) {
    //     // throw new NotYetImplementedException();
    // }
}