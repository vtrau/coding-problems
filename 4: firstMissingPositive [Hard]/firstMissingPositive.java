import java.util.Arrays;
public class firstMissingPositive {
  public static int findPositive(int[] array) {
    //let m = highest number in array
    //time complexity = O(m+n+n) ~ O(n), contains 3 loops
    //space complexity = O(m) extra space, m is the max of array

    int max = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }

    }
    if (max == 0) {
      return 1;
    }

    int[] posArray = new int[max];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        posArray[array[i] - 1] = 1;
      }
    }
    int i = 0;
    for (i = 0; i < posArray.length; i++) {
      if (posArray[i] == 0) {
        return i + 1;
      }
    }
    return i + 1;


  }
  public static void main(String[] args) {
    int[] array1 = {3, 4, -1, 1};
    int[] array2 = {1, 2, 0};
    int[] array3 = { -5, 0 , -1 , -2,-3, -4};
    System.out.println(findPositive(array3));
  }
}
