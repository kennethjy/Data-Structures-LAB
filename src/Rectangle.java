public class Rectangle extends Shape {
    int width, height;

    public Rectangle(int width, int height, String col) {
        super(col);
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

    public Shape(String col){
        this.color = col;
    }

    abstract int getArea();
}