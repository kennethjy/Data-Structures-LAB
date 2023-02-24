public class Rectangle extends Shape {
    int width, height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }
}

abstract class Shape{
    String color;

    public Shape(String color){
        this.color = color;
    }

    abstract int getArea();
}