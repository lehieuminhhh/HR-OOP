package shape;

public class Line implements Drawable
{
    private Point startPoint;
    private Point endPoint;

    public Line(Point a, Point b)
    {
        this.startPoint = a;
        this.endPoint = b;
    }
    public Point getEndPoint()
    {
        return this.endPoint;
    }
    public Point getStartPoint()
    {
        return this.startPoint;
    }
    public void setEndPoint (Point a)
    {
        this.endPoint = a;
    }
    public void setStartPoint (Point a)
    {
        this.startPoint = a;
    }
    public void draw()
    {
        Point end = getEndPoint();
        Point start = getStartPoint();
        System.out.println ("Start Point " + start.toString() );
        System.out.println ("End Point " + end.toString() );
    }
    public boolean equals(Line d)
    {
        if (this.startPoint.equals(d.startPoint) && this.endPoint.equals(d.endPoint))
        {
            return true;
        }
        return false;
    }
}