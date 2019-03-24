//Given an array of integers, return a new array such that each element at index i of the
//new array is the product of all the numbers in the original array except the one at i.

//For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
//If our input was [3, 2, 1], the expected output would be [2, 3, 6].

//Follow-up: what if you can't use division?
//Bonus Follow-up: what if you need constant space

import java.util.Arrays;
public class productExceptSelf {

  public static int[] productWithDivision(int[] array) {
    int[] arr = new int[array.length];
    int product = 1;
    for (int i = 0; i < array.length; i++) {
      product = product * array[i];
    }
    for (int i = 0; i < array.length; i++) {
      arr[i] = product / array[i];
    }
    return arr;
  }

  public static int[] productWithoutDivision(int[] array) {
    int[] array1 = new int[array.length];
    int[] array2 = new int[array.length];
    int firstElement = 1;
    int j = array.length;
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        array1[i] = firstElement;
        array2[array.length - 1] = firstElement;
      }
      //arr   {1,2,3,4,5}
      //arr1  {1,1,2,6,24}
      //arr2  {120,60,20,5,1}
      //prod  {120,60,40,30,24}
      else {
        array1[i] = array[ i - 1] * array1[ i - 1];
        array2[j - 1 - i] = array[j - i] * array2[j - i];
      }
    }

    for (int i = 0; i < array.length; i++) {
      array[i] = array1[i] * array2[i];
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array1 = {1,2,3,4,5};
    System.out.println(Arrays.toString(productWithDivision(array1)));
    System.out.println(Arrays.toString(productWithoutDivision(array1)));
  }
}
