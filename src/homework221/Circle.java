package homework221;
public class Circle extends Shape{
    private String name = "Коло";
    private Point a;
    private Point b;
    public Circle(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }
    public Circle() {
        super();
    }
    public Point getA() {
        return a;
    }
    public void setA(Point a) {
        this.a = a;
    }
    public Point getB() {
        return b;
    }
    public void setB(Point b) {
        this.b = b;
    }
    @Override
    public double getPerimetr() {
        double perimetr=(2*Math.PI*Point.length(a,b));
        return perimetr;
    }
    @Override
    public double getArea() {
        double area=Math.PI*Point.length(a,b)*(Point.length(a,b));
        return area;
    }
    @Override
    public String toString() {
        return "Circle{" + "name=" + name + ", a=" + a + ", b=" + b + '}';
    }
}
