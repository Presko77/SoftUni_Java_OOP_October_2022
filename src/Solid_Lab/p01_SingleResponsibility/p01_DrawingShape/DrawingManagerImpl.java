package Solid_Lab.p01_SingleResponsibility.p01_DrawingShape;

import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import Solid_Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {

    private final Renderer renderer;

    public DrawingManagerImpl( Renderer renderer) {
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        renderer.render( shape);
    }
}
