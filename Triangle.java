public class Triangle {
  //instance variables
  private Point v1, v2, v3;
  //constructors
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1, double x2, double y2,double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  //methods
  public double getPerimeter() {
    return (v1.distanceTo(v2)
    + v2.distanceTo(v3)
    + v3.distanceTo(v1));
  }
  public double getArea() {
    double s = getPerimeter() / 2;
    return Math.sqrt(s *
      (s - v1.distanceTo(v2)) *
      (s - v2.distanceTo(v3)) *
      (s - v3.distanceTo(v1)));
  }
  public String classify() {
    String answer = "";
    double side1 = (Math.round((v1.distanceTo(v2)) * 10000) / 10000.0);
    double side2 = (Math.round((v2.distanceTo(v3)) * 10000) / 10000.0);
    double side3 = (Math.round((v3.distanceTo(v1)) * 10000) / 10000.0);
    if (side1 == side2 && side2 == side3) {
      answer = "equilateral";
    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
      answer = "isosceles";
    } else answer = "scalene";
    return answer;
  }
  public String toString() {
    return ("v1("+ v1.getX() + ", " + v1.getY()
    + ") v2(" + v2.getX() + ", " + v2.getY()
    + ") v3(" + v3.getX() + ", " + v3.getY() + ")" );
  }
  //mutator
  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    } else if (index == 1) {
      v2 = newP;
    } else {
      v3 = newP;
    }
  }
}
