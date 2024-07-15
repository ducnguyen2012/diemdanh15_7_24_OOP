import java.util.HashMap;

public class Square extends Rectangle {
    int val = 0;
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Square)) return false;
        if(o == this) return true;
        Square other = (Square) o;
        return java.util.Objects.equals(this.topLeft, other.topLeft) && this.getLength() == other.getLength();
    }

    @Override
    public int hashCode() {
        int res = java.util.Objects.hashCode(this.getLength()); 
        return res;
    }

    public String toString() {
        return "Square[topLeft=(" + String.format("%.1f",super.topLeft.getPointX()) + "," + String.format("%.1f",super.topLeft.getPointY()) + "),side=" + String.format("%.1f",this.getSide()) + ",color=" + this.getColor() + ",filled="  + this.isFilled() + "]";
    }
}
