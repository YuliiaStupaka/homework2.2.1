package homework221;
public class Square extends Shape{
    private String name = "Квадрат";
    private Point a;
    private Point b;
    public Square(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }
    public Square() {
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
        double perimetr=(4*Point.length(a,b));
        return perimetr;
    }
    @Override
    public double getArea() {
        double area=Point.length(a,b)*(Point.length(a,b));
        return area;
    }
    @Override
    public String toString() {
        return "Square{" + "name=" + name + ", a=" + a + ", b=" + b + '}';
    }
}
