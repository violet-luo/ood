// Shape.java
public abstract class Shape {
    public abstract double area();
}

// Square.java
public class Square extends Shape {
    public int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return this.sideLength * this.sideLength;
    }
}

// Circle.java
public class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
