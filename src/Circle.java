public class Circle {
    public double radius;

    public Circle(){
        radius = 2.5;
    }

    public Circle(double newRadius){
        radius = newRadius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
