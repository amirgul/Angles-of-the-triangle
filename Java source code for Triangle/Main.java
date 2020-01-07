import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Point[] pts = new Point[3];
        for(int i = 0; i<3; i++)
        {
            System.out.println("Enter the coordinates");
            pts[i] = new Point(keyboard.nextDouble(), keyboard.nextDouble());

        }
        Triangle t = new Triangle(pts[0], pts[1], pts[2]);
        System.out.print(t.toString());


    }
}
