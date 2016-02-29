/**
 * Created by guobingkun on 5/26/15.
 */
public class DaemonThread
{
  public static void main(String[] args)
  {
    Runnable r = new Runnable()
    {
      @Override
      public void run()
      {
        int i = 0;
        while (true) {
          System.out.println("Welcome" + i);
          i++;
        }
      }
    };
    Thread t = new Thread(r);
    t.setDaemon(true);
    t.start();
  }
}
