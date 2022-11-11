package Solid_Lab.p03_LiskovSubstitution.p01_Square;

public class Square extends Rectangle {

    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }
}
