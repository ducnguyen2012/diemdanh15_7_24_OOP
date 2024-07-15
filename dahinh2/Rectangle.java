public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Rectangle)) return false;
        if(o == this) return true;
        Rectangle other = (Rectangle) o;
        return java.util.Objects.equals(this.topLeft, other.topLeft) && this.width == other.width && this.length == other.length;
    }

    @Override
    public int hashCode() {
        int res = java.util.Objects.hashCode(this.length); 
        return res;
    }

    public String toString() {
        return "Rectangle[topLeft=(" + String.format("%.1f",this.topLeft.getPointX()) + "," + String.format("%.1f",this.topLeft.getPointY()) + "),width=" + String.format("%.1f",this.getWidth()) + ",length=" + String.format("%.1f",this.getLength())+ ",color=" + this.getColor()+ ",filled=" + this.isFilled() + "]";
    }
 
    
}
