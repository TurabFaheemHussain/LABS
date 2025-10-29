package scd;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length! Setting default (1.0)");
            this.length = 1.0;
        }
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! Setting default (1.0)");
            this.width = 1.0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5.5, 10.0);
        Rectangle rect3 = new Rectangle(25.0, -2.0); // Invalid inputs

        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rect1.getLength() + ", Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Length: " + rect2.getLength() + ", Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());

        System.out.println("\nRectangle 3 (Invalid Input Example):");
        System.out.println("Length: " + rect3.getLength() + ", Width: " + rect3.getWidth());
        System.out.println("Area: " + rect3.calculateArea());
        System.out.println("Perimeter: " + rect3.calculatePerimeter());
    }
}
