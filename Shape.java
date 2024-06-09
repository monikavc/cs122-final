public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String toString() {
        return "Color is " + color;
    }

    public abstract double computeArea();
}