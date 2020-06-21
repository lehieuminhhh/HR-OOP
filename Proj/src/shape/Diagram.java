package shape;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
public class Diagram implements Drawable
{
    Iterator<Drawable> diagrams;
    public Diagram(Iterator<Drawable> t)
    {
        this.diagrams = t;
    }
    public void draw(){};
}