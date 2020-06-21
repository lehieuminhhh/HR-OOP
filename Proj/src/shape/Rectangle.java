package shape;

public class Rectangle extends Shape
{
    private Point leftTop = new Point();
    private double height = 0;
    private double width = 0;

    public Rectangle()
    {
    };
    public Rectangle (Point p, double h, double w)
    {
        this.leftTop = p;
        this.height = h;
        this.width = w;
    }
    public Point getLeftTop()
    {
        return this.leftTop;
    }
    public double getHeight()
    {
        return this.height;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setLeftTop(Point p)
    {
        this.leftTop = p;
    }
    public void setHeight(double h)
    {
        this.height = h;
    }
    public void setWidth(double w)
    {
        this.width = w;
    }
    public double getPerimeter()
    {
        return (this.width + this.height) * 2;
    }
    public double getArea()
    {
        return this.width * this.height;
    }
    public boolean equals(Rectangle a)
    {
        if (this.leftTop.equals(a.getLeftTop()) && this.width == a.getWidth() && this.height == a.getHeight())
        {
            return true;
        }
        return false;
    }
    public void draw()
    {
        System.out.println("Left Top: " + getLeftTop().toString());
        System.out.println("Height: " + getHeight());
        System.out.println("Width: " + getWidth());
    }
}