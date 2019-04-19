import java.util.*;
class Interval {
  public int start;
  public int end;
  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
}
public class RoomsRequired {
  //time complexity O(n), 1 for loop
  //space complexity O(n), created a min heap

  public static int roomsNeeded(Interval[] array) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    //priority queues in java are based off min heap,
    //if you want max heap, set it = new PriorityQueue<Integer>(Collections.reverseOrder());

    //minheap is not empty and starting time is greater than ending time from minHeap, remove first element from minHeap
    for (int i = 0; i < array.length; i++) {
      if (!minHeap.isEmpty() && array[i].start > minHeap.peek()) {
        minHeap.poll();
      }
      //add the end time of current array element to minHeap
      minHeap.offer(array[i].end);
    }
    return minHeap.size();
  }
  public static void main(String[] args) {
    Interval[] intervals = {new Interval(30, 75), new Interval(0, 50), new Interval(60, 150)};
    System.out.println(roomsNeeded(intervals));
  }
}
