public class Point {
  //instance variables
  private double x, y;
  //constructors
  public Point(double X, double Y) {
    x = X;
    y = Y;
  }
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }
  //methods
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public double distanceTo(Point other) {
    return Math.sqrt((this.getX() - other.getX())*(this.getX() - other.getX())
    + (this.getY() - other.getY())*(this.getY() - other.getY()));
  }
  public boolean equals(Point other) {
    return (getX() == other.getX() && getY() == other.getY());
  }
}
