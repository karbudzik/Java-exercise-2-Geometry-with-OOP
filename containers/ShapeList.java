package geometry.containers;

import java.util.ArrayList;
import java.util.List;
import geometry.shapes.Shape;

public class ShapeList implements Printable {
    private List<Shape> shapes;
    
    public ShapeList() {
        shapes = new ArrayList<Shape>();
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public Shape getShapeAt(int index) {
        return shapes.get(index);
    }
    
    public String getShapesTable() {
        String horizontalLineUp = "/" + "-".repeat(135) + "\\" + "\n";
        String heading = String.format("| %-5s | %-20s | %-30s | %-15s | %-15s | %-10s | %-20s |", "idx", "Class",
                        "toString", "Perimeter", "Formula", "Area", "Formula") + "\n";
        String middleLine = String.format("| " + "-".repeat(5) + " | " + "-".repeat(20) + " | " + "-".repeat(30) + " | " +
                            "-".repeat(15) + " | " + "-".repeat(15) + " | " + "-".repeat(10) + " | " + "-".repeat(20) + " |") + "\n";
        String horizontalLineDown = "\\" + "-".repeat(135) + "/" + "\n";
        
        String tableString = horizontalLineUp + heading + middleLine;
        for (int index = 0; index < shapes.size(); index++) {
            Shape myShape = shapes.get(index);
            String shapeToString = String.format("| %-5s | %-20s | %-30s | %-15.2f | %-15s | %-10.2f | %-20s |", 
                                   index, myShape.getName(), myShape.toString(), myShape.calculatePerimeter(), 
                                   myShape.getPerimeterFormula(), myShape.calculateArea(), myShape.getAreaFormula()) + "\n";
            tableString = (index == 0) ? (tableString + shapeToString) : (tableString + middleLine + shapeToString);
        }
        tableString += horizontalLineDown;

        return tableString;
    }

    public Shape getLargestShapeByPerimeter() {
        Shape biggestPerimeterShape = shapes.get(0);
        for (int index = 1; index < shapes.size(); index++) {
            Shape currentShape = shapes.get(index);
            if (currentShape.calculatePerimeter() > biggestPerimeterShape.calculatePerimeter()) {
                biggestPerimeterShape = currentShape;
            }
        }
        return biggestPerimeterShape;
        // wyrzucić błąd gdy nie ma żadnych elementów
    }

    public Shape getLargestShapeByArea() {
        Shape biggestAreaShape = shapes.get(0);
        for (int index = 1; index < shapes.size(); index++) {
            Shape currentShape = shapes.get(index);
            if (currentShape.calculateArea() > biggestAreaShape.calculateArea()) {
                biggestAreaShape = currentShape;
            }
        }
        return biggestAreaShape;
        // wyrzucić błąd gdy nie ma żadnych elementów
    }

    public void printTable() {

    }

    public void printList() {

    } 

}