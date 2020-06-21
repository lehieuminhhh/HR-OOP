package shape;

public class Square extends Rectangle
{
    public Square()
    {
    };
    public Square(Point p, double a)
    {
        setLeftTop(p);
        setHeight(a);
        setWidth(a);
    }
    public void setSide(double a)
    {
        setHeight(a);
        setWidth(a);
    }
    public double getSide()
    {
        return getWidth();
    }
}