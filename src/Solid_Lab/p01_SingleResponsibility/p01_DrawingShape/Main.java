package Solid_Lab.p01_SingleResponsibility.p01_DrawingShape;

import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;
import Solid_Lab.p02_OpenClosedPrinciple.p02_DrawingShape.Circle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(13, 2);
        DrawingManager drawingManager = new DrawingManagerImpl(new ConsoleRender());

        Circle circle = new Circle(13);

        drawingManager.draw(shape);
        drawingManager.draw(circle);
    }
}
