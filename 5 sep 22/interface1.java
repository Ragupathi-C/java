interface Drawable
{
void draw();
}
class rectangle implements Drawable
{
public void draw()
{
System.out.println("drawing a rectangle");
}
}
class circle implements Drawable
{
public void draw()
{
System.out.println("drawing a circle");
}
}
class interface1
{
public static void main(String []args)
{
Drawable dr=new rectangle();
dr.draw();
Drawable dc=new circle();
dc.draw();
}
}