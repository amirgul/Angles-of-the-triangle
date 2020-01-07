import java.text.DecimalFormat;

public class Triangle
{
    private Point a,b,c;
    public Triangle(Point ina, Point inb, Point inc)
    {
        a = ina;
        b = inb;
        c = inc;
    }
    public String toString()
    {
        DecimalFormat round = new DecimalFormat("#.##");
        String ans = "data: ";
        ans = ans + round.format(a.distance(b) + " , " +round.format(b.distance(c)) + " , " + round.format(c.distance(a))) + " \n";
        ans = ans + round.format(a.angleWith(b,c)) + " " + round.format(b.angleWith(c,a)) + round.format(c.angleWith(a,b)) + " \n";
        return ans;

    }
}