abstract class Shape {
    abstract void resize(double factor);
    abstract void rotate(double angle);
}

class Circle extends Shape {
    private double radius = 5.0;

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized. New radius: " + radius);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating circle by " + angle + " degrees (no visual change).");
    }
}

class Square extends Shape {
    private double side = 4.0;

    @Override
    void resize(double factor) {
        side *= factor;
        System.out.println("Square resized. New side: " + side);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating square by " + angle + " degrees.");
    }
}

class Triangle extends Shape {
    private double base = 3.0;
    private double height = 4.0;

    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
        System.out.println("Triangle resized. New base: " + base + ", New height: " + height);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating triangle by " + angle + " degrees.");
    }
}

public class ShapeManipulator {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Triangle();

        shape1.resize(2.0);
        shape1.rotate(90);

        shape2.resize(1.5);
        shape2.rotate(45);

        shape3.resize(3.0);
        shape3.rotate(180);
    }
}
