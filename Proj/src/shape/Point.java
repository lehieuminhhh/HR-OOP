package shape;

public class Point
{
    private double x = 0;
    private double y = 0;

    public Point()
    {

    };
    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX ()
    {
        return this.x;
    }
    public double getY ()
    {
        return this.y;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public String toString()
    {
        double a = getX();
        double b = getY();
        String s = "(";
        s += a;
        s += ',';
        s += b;
        s += ')';
        return s;
    }
    public boolean equals (Point a)
    {
        if (this.x == a.x && this.y == a.y)
        {
            return true;
        }
        return false;
    }

}