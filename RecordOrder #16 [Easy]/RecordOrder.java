public class RecordOrder {
  static class Log {
    public int maxSize;
    public int[] log;
    public int index;

    //create an array with max size n
    //create an index 0 as first element
    public Log(int n) {
      this.maxSize = n;
      this.log = new int[n];
      this.index = 0;
    }

    //insert element at index and increase index for next element
    public void record(int orderId) {
      log[index] = orderId;
      index++;
    }

    //use the incremented index and i to find last i'th elements
    //return null if less or equal to 0 since there are no last negative elements
    public Integer getLast(int i) {
      if (i <= 0) {
        return null;
      }
      return log[index - i];
    }
  }

  public static void main(String[] args) {
    Log orders = new Log(10);
    orders.record(1);
    orders.record(3);
    orders.record(5);
    System.out.println(orders.getLast(1));
    System.out.println(orders.getLast(2));
    System.out.println(orders.getLast(3));
  }
}
