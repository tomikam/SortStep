
public class Stopwatch {
  private long start;
  private long stop;
  public void start()
    /* begins keeping track of time */
  {
    
    start = System.nanoTime();
  }
  public void stop()
    /* stops keeping track of time */
  {
    
    stop = System.nanoTime();
  }
  public long elapsedTime()
    /* uses System.out to display the elapsed time in seconds */
  {
    // Replace the following line with your code
    System.out.println("TEST" + (start - stop));
    return stop - start;
  }
  public void reset()
    /* resets the elapsed time to 0 */
  {
    //your code here
    start = stop;
  }
}

