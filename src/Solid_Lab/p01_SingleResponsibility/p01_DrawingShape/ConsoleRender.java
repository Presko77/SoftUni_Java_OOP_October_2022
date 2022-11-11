package Solid_Lab.p01_SingleResponsibility.p01_DrawingShape;

import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;

public class ConsoleRender implements Renderer {
    @Override
    public void render(Shape shape) {
        System.out.println("Shape with area " + shape.getArea());
    }
}
