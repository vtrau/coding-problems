import java.util.*;
public class MaxSlidingArray {
  public static void max(int[] array, int k) {
    //time complexity, O(2n) ~ O(n), every item in array is added (n) and removed (n) from list
    //additional space complexity, O(k+1) ~ O(k), size of subarray


    LinkedList<Integer> subArray= new LinkedList<Integer>();
    for (int i = 0; i < array.length; i++) {
      //create sliding array (double ended queue) with k size
      if (i < k) {
        //insert element in sliding array as last element
        subArray.offerLast(array[i]);

        //if any elements before last element is less than last element, remove those elements
        while (subArray.peekFirst() < subArray.peekLast()) {
          subArray.removeFirst();
        }

      }

      else {

        //print the max of sliding array
        System.out.println(subArray.peekFirst());

        //insert element in sliding array as last element
        subArray.offerLast(array[i]);

        //if sliding array size is greater than what it's supposed to be, remove first element
        while (subArray.size() > k) {
          subArray.removeFirst();
        }

        //if any elements before last element is less than last element, remove those elements
        while (subArray.peekFirst() < subArray.peekLast() ) {
          subArray.pollFirst();
        }

      }



    }
    //print the last max of sliding array
    System.out.println(subArray.pollFirst());


  }
  public static void main(String[] args) {
    int[] array1 = {10,5,2,7,8,7};
    int[] array2 = {1,2,3,4,5,6};
    int[] array3 = {0,1};
    int k = 3;
    max(array1,3);
  }
}
