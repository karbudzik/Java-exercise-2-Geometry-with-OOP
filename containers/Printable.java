package geometry.containers;

import geometry.shapes.Shape;

public interface Printable {

    /**
     * Prints all fields in the enumerated list.
     */
    public void printShape(String message, Shape shape);
    
    /**
     * Prints all fields in the table form.
     */
    public void printTable();
  }