public class testMain {
    public static void main(String[] args) {
        Point center = new Point(10.0,5.0);
        Shape tron = new Circle(center, 8.0, "RED",true);
        Shape chunhat = new Rectangle(center, 8.0,6.0, "RED",true);
        Shape tron2 = new Circle(center, 8.0, "RED", true);
        Shape vuong = new Square(center, 8.0, "RED", true);
        Shape vuong2 = new Square(center, 8.0, "blue", true);
        Layer layer = new Layer();
        System.out.println(tron);
        System.out.println(chunhat);
        System.out.println(tron2);
        System.out.println(vuong);
        System.out.println(tron.hashCode());
        System.out.println(chunhat.hashCode());
        System.out.println(tron2.hashCode());
        System.out.println(vuong.hashCode());
        layer.addShape(tron);
        layer.addShape(chunhat);
        layer.addShape(tron2);
        layer.addShape(vuong);
        layer.addShape(vuong2);
        System.out.println(layer.getInfo());
        layer.removeCircles();
        System.out.println(layer.getInfo());
        layer.removeDuplicates();
        System.out.println(layer.getInfo());
    }
}
