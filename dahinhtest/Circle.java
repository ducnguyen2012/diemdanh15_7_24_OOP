import java.util.HashMap;
import java.util.Map;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point center, double radius, String colorm, boolean filled) {
        super(colorm, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Circle[center=(" + (double)Math.round(this.center.getPointX()) + "," + (double)Math.round(this.center.getPointY()) + "),radius=" + (double)Math.round(this.getRadius()) + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Circle)) return false;
        if(o == this) return true;
        Circle other = (Circle) o;
        return java.util.Objects.equals(this.center, other.center) && this.radius == other.radius;
    }

    @Override
    public int hashCode() {
        int res = java.util.Objects.hashCode(this.center); 
        return res;
    }

}
