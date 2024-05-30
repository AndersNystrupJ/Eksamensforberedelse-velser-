package org.example;

public class Square implements ShapeCircleSquare {
    private double width;


    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        double area = width * width;
        return area;
    }
}
