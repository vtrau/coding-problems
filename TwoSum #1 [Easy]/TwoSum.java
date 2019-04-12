import java.util.Arrays;
import java.util.HashSet;
public class TwoSum {

  //Contains nested double loop, O(n^2) time complexity
  //Only checking if array elements are equal, O(1) space complexity
  public static boolean twoSumBruteForce(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] == target - array[i])
          return true;
      }
    }
    return false;
  }

  //Contains Arrays.sort(tim sort) and 2 loops, nlogn + 2n = O(nlogn) time complexity
  //tim sort worse case needs n space to sort array, O(n) space complexity
  public static boolean twoSumBetter(int[] arr1, int target) {
    //arr1          {1,4,45,6,10,-8}
    //sorted arr1   {-8,1,4,6,10,45}
    //arr2          {24,15,12,10,6,-29}
    Arrays.sort(arr1);
    int[] arr2 = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 16 - arr1[i];
    }
    int length = arr1.length;
    int a = 0;
    int b = length - 1;
    int interCount = 0;
    while (a < length && b >= 0) {
      if (arr1[a] > arr2[b])
        b--;
      else if (arr2[b] > arr1[a])
        a++;
      else {
        interCount++;
        a++;
        b--;
      }
    }
    if (interCount%2 == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  //Contains 1 loop, O(n) time complexity
  //HashMap contains n values, O(n) space complexity
  public boolean twoSumBest(int[] array, int target) {
    HashSet<Integer> set = new HashSet<Integer>(array.length);
    for (int i = 0; i < array.length; i++) {
        int diff = target - array[i];
        if (set.contains(diff)) {
            return true;
        }
        set.add(array[i]);
    }
    return false;
}

  public static void main(String[] args) {
      int[] array1 = {10,15,3,7};
      int[] array2 = {1,2,8,8};
      int[] array3 = {2, 6, 8, 4, 5};
      int target1 = 17;
      int target2 = 16;
      int target3 = 15;
      System.out.println(twoSumBruteForce(array1, target1));
      System.out.println(twoSumBetter(array1,target1));
      System.out.println(twoSumBruteForce(array2, target2));
      System.out.println(twoSumBetter(array2, target2));
      System.out.println(twoSumBruteForce(array3, target3));
      System.out.println(twoSumBetter(array3, target3));
  }
}
