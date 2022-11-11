package Solid_Lab.p02_OpenClosedPrinciple.p02_DrawingShape;

import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
