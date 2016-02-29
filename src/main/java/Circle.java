/**
 * Created by guobingkun on 6/16/15.
 */
public class Circle extends Shape
{

  private double radius = 5;

  @Override
  public double getArea()
  {
    return radius * radius * Math.PI;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }
}
