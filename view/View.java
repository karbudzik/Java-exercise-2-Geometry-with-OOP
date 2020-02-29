package view;

import java.util.List;
import java.util.Scanner;

import shapes.Shape;

public class View {
    
    public void printMainMenu() {
        List<String> menu = List.of("Add new shape", "Show all shapes", "Show shape with th largest perimeter", 
                                    "Show shape with the largest area", "Show formulas");
        System.out.println("\n What to you want to do: ");
        for (int i = 1; i <= menu.size(); i++) {
            System.out.println(" ( " + i + " ) " + menu.get(i-1));
        }
        System.out.println(" ( 0 ) Exit program");
    }

    public void printAvailableShapes(String message) {
        clearScreen();
        List<String> shapes = List.of("Circle", "Triangle", "Equilateral Triangle", "Rectangle", "Square", "Regular Pentagon");
        System.out.println("\n " + message);
        for (int i = 1; i <= shapes.size(); i++) {
            System.out.println(" ( " + i + " ) " + shapes.get(i-1));
        }
    }

    public void printTable(String tableToString) {
        clearScreen();
        System.out.println(" ".repeat(63) + "YOUR SHAPES: \n");
        System.out.println(tableToString);
        printMainMenu();
    }

    public void printShape(String message, Shape shape) {
        clearScreen();
        System.out.printf(" %s", message);
        System.out.printf(" %s, perimeter: %.3f, area: %.3f.\n", 
                          shape.toString(), shape.calculatePerimeter(), shape.calculateArea());
        printMainMenu();
    } 

    public void printMessage(String message) {
        clearScreen();
        System.out.println("\n " + message);
        printMainMenu();
    }

    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public int getIntInput(String message) throws IllegalArgumentException { 
        
        System.out.println("\n" + " " + message);
        System.out.print(" ");

        Scanner scannerFromUser = new Scanner(System.in);
        int input = scannerFromUser.nextInt();
        
        if (input <= 0) {
            throw new IllegalArgumentException("Shape's dimentions need to be bigger than 0!");
        }

        return input;
    }

    public int getIntInput(String message, int fromNumber, int toNumber) throws IllegalArgumentException {
        System.out.println("\n" + " " + message);
        System.out.print(" ");

        Scanner scannerFromUser = new Scanner(System.in);
        int input = scannerFromUser.nextInt();
        
        if (input < fromNumber || input > toNumber) {
            throw new IllegalArgumentException("The given number should be from " + fromNumber + " to " + toNumber + ".");
        }
        return input;
    }

}

    