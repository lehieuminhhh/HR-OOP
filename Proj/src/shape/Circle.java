package shape;

public class Circle extends Shape
{
    private Point center = new Point();
    private double radius = 0;

    public Circle()
    {
    };
    public Circle (Point o, double r)
    {
        this.center = o;
        this.radius = r;
    }
    public Point getCenter()
    {
        return this.center;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setCenter(Point o)
    {
        this.center = o;
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }
    public double getPerimeter()
    {
        return 2*getRadius()*Math.PI;
    }
    public double getArea()
    {
        return Math.PI*getRadius()*getRadius();
    }
    public boolean equals (Circle o)
    {
        if (this.center.equals(o.getCenter()) && this.radius == o.getRadius())
        {
            return true;
        }
        return false;
    }
    public void draw()
    {
        System.out.println("Center: " + getCenter().toString());
        System.out.println("Radius" + getRadius());
    }
}