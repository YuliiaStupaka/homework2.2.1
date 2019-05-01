package homework221;
public class Triangle extends Shape{
    private String name = "Трикутник";
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle() {
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
    public Point getC() {
        return c;
    }
    public void setC(Point c) {
        this.c = c;
    }
    @Override
    public double getPerimetr(){
        double perimetr=(Point.length(a,b)+Point.length(b,c)+Point.length(a,c));
        return perimetr;
    }
    @Override
    public double getArea(){
        double p=(this.getPerimetr())/2;
        double area=Math.sqrt(p*(p-Point.length(a,b))*(p-Point.length(b,c))*(p-Point.length(a,c)));
        return area;
    }
    @Override
    public String toString() {
        return "Triangle{" + "name=" + name + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }   
}
