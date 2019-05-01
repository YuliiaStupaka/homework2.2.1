package homework221;
public class Homework221 {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(new Point(2,3),new Point(-2,5),new Point(4,3));
        System.out.println(triangle.toString());
        System.out.println("Perimetr = "+String.format("%."+2+"f",triangle.getPerimetr()));
        System.out.println("Area = "+String.format("%."+2+"f",triangle.getArea()));
        
        Circle circle=new Circle(new Point(2,4),new Point(-2,5));
        System.out.println(circle.toString());
        System.out.println("Perimetr = "+String.format("%."+2+"f",circle.getPerimetr()));
        System.out.println("Area = "+String.format("%."+2+"f",circle.getArea()));
        
        Square square=new Square(new Point(2,4),new Point(-2,5));
        System.out.println(square.toString());
        System.out.println("Perimetr = "+String.format("%."+2+"f",square.getPerimetr()));
        System.out.println("Area = "+String.format("%."+2+"f",square.getArea()));
    }
}
