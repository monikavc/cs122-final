public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    public double computeArea() {
        double area = 0.5 * base * height;
        return area;
    }

    public String toString() {
        return "Triangle: " + super.toString() + "; base is " + base + "; height is " + height + ".";
    }
}