import java.util.*;
public class MaxSlidingArray {
  public static void max(int[] array, int k) {
    //time complexity, O(2n) ~ O(n), every item in array is added (n) and removed (n) from list
    //additional space complexity, O(k+1) ~ O(k), size of subarray

    int max = 0;
    LinkedList<Integer> subArray= new LinkedList<Integer>();
    for (int i = 0; i < array.length; i++) {
      if (i < k) {
        subArray.offerLast(array[i]);
        while (subArray.peekFirst() < subArray.peekLast()) {
          subArray.removeFirst();
        }

      }

      else {
        System.out.println(subArray.peekFirst());
        subArray.offerLast(array[i]);
        while (subArray.size() > k) {
          subArray.removeFirst();
        }
        while (subArray.peekFirst() < subArray.peekLast() ) {
          subArray.pollFirst();
        }

      }



    }
    System.out.println(subArray.pollFirst());


  }
  public static void main(String[] args) {
    int[] array1 = {10,5,2,7,8,7};
    int[] array2 = {1,2,3,4,5,6};
    int[] array3 = {0,1};
    int k = 3;
    max(array3,3);
  }
}
