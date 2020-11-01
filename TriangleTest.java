public class TriangleTest {
  public static void main(String[] args) {
    Point p1 = new Point(0, 1);
    Point p2 = new Point(p1);
    Point p3 = new Point(3, 8);
    Point p4 = new Point(10, 15);
    Point p5 = new Point(0, 0);
    Triangle t1 = new Triangle(p2, p3, p4);
    Triangle t2 = new Triangle(0, 0, 2, 0, 0, 2);
    Triangle t3 = new Triangle(0, 0, 4, 0, 2, 2 * Math.sqrt(3));
    Triangle t4 = new Triangle(p2, p3, p4);
    t4.setVertex(0, p5);
    //real testing
    System.out.println(p2.getY() == 1.0);
    System.out.println(p4.getX() == 10.0);
    System.out.println(t1.classify());
    System.out.println(t2.classify());
    System.out.println(t3.classify());
    System.out.println(t4.toString());
  }
}
