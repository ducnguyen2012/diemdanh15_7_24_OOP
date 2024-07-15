import java.util.ArrayList;
import java.util.HashSet;

public class Layer {
    private java.util.ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
            shapes.add(shape);
    }

    public void removeCircles() {
        java.util.Iterator<Shape> iter = shapes.iterator();
        if(!shapes.isEmpty())
        {
            while(iter.hasNext()) {
                Shape temp = iter.next();
                if(temp instanceof Circle) {
                    iter.remove();
                }
            }
        } 
    }

    public String getInfo() {
        String res = "";
        for(Shape s : shapes) {
            res += s;
            res += "\n";
        }
        return "Layer of crazy shapes:\n" + res;
    }

    public void removeDuplicates() {
        java.util.Set<Shape> unique = new HashSet<>();
        int i = 0;
        while(i < shapes.size()) {
            if(!unique.add(shapes.get(i))) {
                shapes.remove(i);
            }
            else {
                i += 1;
            }
        }
    }
}
