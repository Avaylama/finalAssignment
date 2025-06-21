public class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean type) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Geometry geo = new Geometry();

        System.out.println("Area of Circle: " + geo.calculateArea(7.0));
        System.out.println("Area of Rectangle: " + geo.calculateArea(5.0, 8.0));
        System.out.println("Area of Triangle: " + geo.calculateArea(6.0, 4.0, true));
    }
}
