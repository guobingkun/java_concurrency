import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by guobingkun on 5/18/15.
 */
public class ThreadId
{
  // Atomic integer containing the next thread ID to be assigned
  private static final AtomicInteger nextId = new AtomicInteger(0);

  // Thread local variable containing each thread's ID
  private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
    @Override
    protected Integer initialValue()
    {
      System.out.println("ThreadID=" + Thread.currentThread().getName() + " val=" + nextId.get());
      return nextId.getAndIncrement();
    }
  };

  // Returns the current thread's unique ID, assigning it if necessary
  public static int get() {
    return threadId.get();
  }

  public static void main(String args[]) {
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 10; ++i) {
      new Thread("" + i) {
        public void run() {
          System.out.println(get());
        }
      }.start();
    }
  }
}
