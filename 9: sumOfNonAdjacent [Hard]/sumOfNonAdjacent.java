import java.util.Arrays;

public class sumOfNonAdjacent {
  public static int sum(int[] array) {
    int length = array.length;
    int[] arr1 = new int[length/2];
    int[] arr2 = new int[length/2];
    int index = 0;
    for (int i = 0; i < arr1.length; i++) {
        arr1[i] = array[index];
        index++;
        arr2[i] = array[index];
        index++;
    }

    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      int number = 0;
      int number1 = arr1[i]; //number3 and number4
      int number2 = arr2[i]; //number 4
      int number3 = arr1[i+1];
      int number4 = arr2[i+1];

      int sum1 = number1 + number3;
      int sum2 = number1 + number4;
      int sum3 = number2 + number4;

      if (sum1 > sum2 && sum1 > sum3) {
        number = sum1;
      }
      else if (sum2 > sum3) {
        number = sum2;

      }
      else {
        number = sum3;
      }
      sum += number;

    }
    return sum;
  }



  public static void main(String[] args) {
      int[] array1 = {2,4,6,2,5};
      //arr1 {2,6,5}
      //arr2 {4,2}
      int[] array2 = {5,1,1,5};
      System.out.println(sum(array2));
      //arr1 {5,1}
      //arr2 {1,5}

  }
}
