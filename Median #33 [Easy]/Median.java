import java.util.PriorityQueue;
import java.util.Collections;
public class Median {
  public static void runningMedian(int[] array) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    for (int i = 0; i < array.length; i++) {
      if (maxHeap.isEmpty()) {
        maxHeap.offer(array[i]);
      }
      else if (array[i] <= maxHeap.peek()) {
        maxHeap.offer(array[i]);
      }
      else {
        minHeap.offer(array[i]);
      }


      if (maxHeap.size() > minHeap.size() + 1) {
        minHeap.offer(maxHeap.poll());
      }
      else if (maxHeap.size() < minHeap.size()) {
        maxHeap.offer(minHeap.poll());
      }

      if (i%2 == 0) {
        System.out.println(maxHeap.peek()/1.0);
      }
      else if (i%2 == 1) {
        System.out.println((maxHeap.peek() + minHeap.peek())/2.0);
      }
    }
  }
  public static void main(String[] args) {
    int[] array = {2,1,5,7,2,0,5};
    runningMedian(array);
  }
}
