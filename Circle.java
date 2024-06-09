import java.lang.Comparable;

public class Circle extends Shape implements Comparable <Circle> {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double computeArea() {
        
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle: " + super.toString() + "; radius is " + radius + ".";
    }

    public int compareTo(Circle circle) {
        // compares circles by their radius
        if (this.radius > circle.getRadius())
            return 1;
        else if (this.radius == circle.getRadius())
            return 0;
        else
            return -1;
    }
}
