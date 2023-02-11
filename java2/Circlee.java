public class Circlee {
    private double radius;

public Circlee() {
    super();
    this.radius = 1.0;
}

public Circlee(double radius) {
    super();
    this.radius = radius;
}

public Circle (double radius, String color) {
    this(radius);
    setColor(color);
}

public Circle (double radius, String color, boolean filled) {
    this(radius, color);
    setFilled(filled);
}

public double getRadius() {
    return radius; 
}

public void setRadius(double radius) {
    this.radius = radius;
}

public double getArea() {
    return radius * radius * Math.PI;
}

public double getPerimeter() {
    return 2 * radius * Math.PI;
}

@Override
public String toString() {
    return "A Circle with radius = "+ radius
         + ", which is a subclass of "+ super.toString();
}

}
