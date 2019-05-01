package homework221;
public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    public Point() {
        super();
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static double length(Point a, Point b) {
        double lenght=Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        return lenght;
    }
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
