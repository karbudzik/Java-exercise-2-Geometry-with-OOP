import java.util.InputMismatchException;

import containers.ShapeList;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;
import shapes.Circle;
import shapes.EquilateralTriangle;
import shapes.Rectangle;
import shapes.RegularPentagon;
import view.View;

public class Main {
    public static View myView;
    public static ShapeList myShapeList;
    public static void main(String[] args) {
	    boolean isRunning = true;
        myView = new View();
        myShapeList = new ShapeList();

        myView.clearScreen();
        myView.printMainMenu();
        while (isRunning) {
            try {
                int option = myView.getIntInput("Your choice: ", 0, 5);
                switch (option) {
                    case 1:
                        myView.printAvailableShapes("Which shape do you want to add?");
                        int shapeToAddNumber = myView.getIntInput("Which shape do you choose? Type the number of shape: ", 1, 6);  
                        Shape shapeToAdd = getShapeToMake(shapeToAddNumber);
                        myShapeList.addShape(shapeToAdd);
                        myView.printMessage("Shape added!");
                        break;
                    case 2: 
                        myView.printTable(myShapeList.getShapesTable());
                        break;
                    case 3:      
                        myView.printShape("Shape with biggest perimeter:", myShapeList.getLargestShapeByPerimeter());
                        break;
                    case 4:  
                        myView.printShape("Shape with biggest area:", myShapeList.getLargestShapeByArea()); 
                        break;
                    case 5:     
                        myView.printAvailableShapes("Which formula do you want to know?");
                        int shapeToShowFormulasNumber = myView.getIntInput("Which shape do you choose? Type the number of shape: ", 1, 6);
                        String formula = getFormula(shapeToShowFormulasNumber); 
                        myView.printMessage(formula);  
                        break;
                    case 0:
                        isRunning = false;
                }
            } catch (IllegalArgumentException e) {
                myView.printMessage(e.getMessage());
            } catch (InputMismatchException e) {
                myView.printMessage("Wrong input!");
            } catch (IndexOutOfBoundsException e) {
                myView.printMessage("You don't have any shapes!");
            }
        }
    }

    private static Shape getShapeToMake(int number) {
        Shape shapeToMake;
        switch (number) {
            case 1:
                int r = myView.getIntInput("Length of circle's radius: ");
                shapeToMake = new Circle(r);
                break;
            case 2:
                int a = myView.getIntInput("Length of first side: ");
                int b = myView.getIntInput("Length of second side: ");
                int c = myView.getIntInput("Length of third side: ");
                shapeToMake = new Triangle(a, b, c);
                break;
            case 3:
                int x = myView.getIntInput("Length of triangle's side: ");
                shapeToMake = new EquilateralTriangle(x);
                break;
            case 4:
                int y = myView.getIntInput("Length of rectangle's first side: ");
                int z = myView.getIntInput("Length of rectangle's second side: ");
                shapeToMake = new Rectangle(y, z);
                break;
            case 5:
                int s = myView.getIntInput("Length of square's side: ");
                shapeToMake = new Square(s);
                break;
            case 6:
                int p = myView.getIntInput("Length of pentagon's side: ");
                shapeToMake = new RegularPentagon(p);
                break;
            default:
                throw new IllegalArgumentException("Can't make such shape!");       
        }
        return shapeToMake;
    }

    private static String getFormula(int number) {
        Shape shapeToMake;
        String formula;
        switch (number) {
            case 1:
                shapeToMake = new Circle(1);
                break;
            case 2:
                shapeToMake = new Triangle(1, 1, 1);
                break;
            case 3:
                shapeToMake = new EquilateralTriangle(1);
                break;
            case 4:
                shapeToMake = new Rectangle(1, 1);
                break;
            case 5:
                shapeToMake = new Square(1);
                break;
            case 6:
                shapeToMake = new RegularPentagon(1);
                break;
            default:
                throw new IllegalArgumentException("Can't make such shape!");       
        }
        formula = String.format("%s perimeter formula is %s.\n %s area formula is %s.", shapeToMake.getName(), 
                  shapeToMake.getPerimeterFormula(), shapeToMake.getName(), shapeToMake.getAreaFormula());
        
        return formula;
    }
}
