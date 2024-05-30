package org.example;

public class Circle implements ShapeCircleSquare {
    private double radius;


    public Circle (double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

}
