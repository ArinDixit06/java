class shape {
    void area(){
        System.out.println("Area");
    }
}

class Circle extends shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void area(){
        System.out.println(Math.PI*radius*radius);

    }
}

class Rectangle extends shape{
    double length;
    double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    void area(){
        System.out.println(length*width);
    }
}


public class display {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("hierarchical inheritance:");
        circle.area();
        rectangle.area();
    }
}
