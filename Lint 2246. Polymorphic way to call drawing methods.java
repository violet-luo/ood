// Figure.java
public class Figure {
    public void onDraw() {
        System.out.println("Drawing figure");
    }
}

// Triangle.java
public class Triangle extends Figure {
    @Override
    public void onDraw() {
        System.out.println("Draw triangles");
    }
}

// Parallelogram.java
public class Parallelogram extends Figure {
    @Override
    public void onDraw() {
        System.out.println("Drawing parallelograms");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Figure();
        Figure figure2 = new Triangle();
        Figure figure3 = new Parallelogram();

        figure1.onDraw();
        figure2.onDraw();
        figure3.onDraw();
    }
}
