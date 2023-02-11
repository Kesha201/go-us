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

}
