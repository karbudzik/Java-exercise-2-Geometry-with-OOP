package geometry.view;

import geometry.Main;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class View {
    
    public void printMainMenu() {
       
        List<String> menu = new ArrayList<String>();
        menu.add("Add new shape");
        menu.add("Show all shapes");
        menu.add("Show shape with th largest perimeter");
        menu.add("Show shape with the largest area");
        menu.add("Show formulas");

        System.out.println("\n What to you want to do: ");
        for (int i = 1; i <= menu.size(); i++) {
            System.out.println(" ( " + i + " ) " + menu.get(i-1));
        }
        System.out.println(" ( 0 ) Exit program");
    }

    public void printAvailableShapes() {
        List<String> shapes = List.of("Circle", "Triangle", "Equilateral Triangle", "Rectangle", "Square", "Regular Pentagon");
        System.out.println("\n Which formula do you want to know? ");
        for (int i = 1; i <= shapes.size(); i++) {
            System.out.println(" ( " + i + " ) " + shapes.get(i-1));
        }
    }

    // dodać parametr int wyrzucający wyjątki gdy wyhcodzimy poza liczbę x
    public int getIntInput(String message) {
        System.out.println("\n" + " " + message);
        System.out.print(" ");
        Scanner scannerFromUser = new Scanner(System.in);
        int input = scannerFromUser.nextInt();
        
        return input;
        // obsługa wyjątków gdy nie int
    }

    public void printMessage(String message) {
        System.out.println("\n " + message);
    }


    // dodać clear screan
}

    