import java.util.concurrent.atomic.AtomicReference;

public class AtomicPackage
{
  public static void main(String[] args)
  {
    Circle circle = new Circle();
    AtomicReference<Circle> aCircle = new AtomicReference<>(circle);
    System.out.println(circle.getArea());
    System.out.println(aCircle.get().getArea());

    circle.setRadius(10);
    System.out.println(circle.getArea());
    System.out.println(aCircle.get().getArea());
  }
}
