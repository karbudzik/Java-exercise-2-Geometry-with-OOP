package geometry;

import geometry.containers.ShapeList;
import geometry.shapes.Shape;
import geometry.shapes.Circle;
import geometry.shapes.EquilateralTriangle;
import geometry.shapes.Rectangle;
import geometry.view.View;

public class Main {
    public static View myView;
    public static void main(String[] args) {
	    boolean isRunning = true;
        myView = new View();
        ShapeList myShapeList = new ShapeList();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(8, 2);
        Shape equilateralTriangle = new EquilateralTriangle(20);

        myShapeList.addShape(circle);
        myShapeList.addShape(rectangle);
        myShapeList.addShape(equilateralTriangle);

        myView.printMainMenu();
	    while (isRunning) {
	        int option = myView.getIntInput("Your choice: ");

            switch (option) {
                case 1:
                    // Add new shape
                    break;
                case 2:
                    myShapeList.printTable();
                    break;
                case 3:
                    myShapeList.printShape("Shape with biggest perimeter:", myShapeList.getLargestShapeByPerimeter());
                    break;
                case 4:
                    myShapeList.printShape("Shape with biggest perimeter:", myShapeList.getLargestShapeByArea());
                    break;
                case 5:
                    // Show formulas
                    break;
                case 0:
                    isRunning = false;
            }
        }
    }
}
