package org.example;

import java.util.ArrayList;

public class CircleSquareMain {


    public static void main(String[] args) {
        ArrayList<ShapeCircleSquare> shapes = new ArrayList<>();

        shapes.add(new Circle(4));
        shapes.add(new Circle(7));
        shapes.add(new Circle(2));
        shapes.add(new Square(9));
        shapes.add(new Square(5));
        shapes.add(new Square(4));

        for (ShapeCircleSquare shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }

    }
}
