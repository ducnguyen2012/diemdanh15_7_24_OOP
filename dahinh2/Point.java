public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return this.pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(this.pointX - newPoint.pointX,2) + Math.pow(this.pointY - newPoint.pointY,2));
    }

    public boolean equals(Object o) {
        if(o instanceof Point) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }
}
