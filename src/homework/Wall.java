package homework;

public class Wall {

    // Instance variables
    private double width;
    private double height;

    // No-arg constructor (default constructor)
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // Parameterized constructor
    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    // Method to get width
    public double getWidth() {
        return width;
    }

    // Method to get height
    public double getHeight() {
        return height;
    }

    // Method to set width (with validation)
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;  // Set to 0 if width is less than 0
        } else {
            this.width = width;
        }
    }

    // Method to set height (with validation)
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;  // Set to 0 if height is less than 0
        } else {
            this.height = height;
        }
    }

    // Method to calculate the area of the wall
    public double getArea() {
        return this.width * this.height;  // Area = width * height
    }
}
