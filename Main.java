package geometry;

import geometry.containers.ShapeList;
import geometry.shapes.Shape;
import geometry.shapes.Circle;
import geometry.shapes.EquilateralTriangle;
import geometry.shapes.Rectangle;

public class Main {

    public static void main(String[] args) {
	    
	    // boolean isRunning = true;
        ShapeList myShapeList = new ShapeList();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(8, 2);
        Shape equilateralTriangle = new EquilateralTriangle(20);

        myShapeList.addShape(circle);
        myShapeList.addShape(rectangle);
        myShapeList.addShape(equilateralTriangle);

        System.out.println(myShapeList.getShapesTable());
	    // while (isRunning) {
	    //     int option = 0; // TODO: get option from user

        //     switch (option) {
        //         case 1:
        //             // Add new shape
        //             break;
        //         case 2:
        //             // Show all shapes
        //             break;
        //         case 3:
        //             // Show shape with the largest perimeter
        //             break;
        //         case 4:
        //             // Show shape with the largest area
        //             break;
        //         case 5:
        //             // Show formulas
        //             break;
        //         case 0:
        //             isRunning = false;
        //             break;

        //     }
        // }
    }
}
