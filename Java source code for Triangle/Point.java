public class Point
{
    private double x, y;
    public Point(double inx, double iny)
    {
        x = inx;
        y = iny;
    }
    public double distance(Point other)
    {
        return (x - other.x)*(x-other.x) + (y-other.y) * (y-other.y);
    }
    public double angleWith(Point b, Point c)
    {
        double dotProduct = (b.x -x)*(c.x -x) + (b.y -y)*(c.y-y);
        double cosangle = dotProduct/distance(b)*distance(c);
        return Math.toDegrees(Math.acos(cosangle));
    }
}