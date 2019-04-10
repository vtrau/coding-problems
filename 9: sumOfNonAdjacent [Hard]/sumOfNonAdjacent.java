import java.util.Arrays;

public class sumOfNonAdjacent {
  public static int[] sum(int[] array) {
    int length = array.length;
    int[] array2 = new int[length/2];
    if (length%2 == 1) {
      length++;
    }
    int[] array1 = new int[length/2];
    int index = 0;
    for (int i = 0; i < array1.length; i++) {
      array1[i] = array[index];
      index = index + 2;
    }
    index = 1;
    for (int i = 0; i < array2.length; i++) {
      array2[i] = array[index];
      index = index + 2;
    }

    for (int i = 0; i < array1.length; i++) {
      int number;
      int number1 = array1[i];
      int number2 = array2[i];
      int number3 = array1[i+1];
      int number4 = array2[i+1];
      int sum1 = number1 + number3;
      int sum2 = number1 + number4;
      int sum3 = number2 + number4;
      number1
      if (i == array1.length - 1) {

      }

      else {
        if (sum1 > sum2 && sum1 > sum3) {
          number = number1;
        }
        else if (sum2 > sum3) {
          number = number1;
        }
        else {
          number = number2;
        }
      }



    }
    return sum;
  }



  public static void main(String[] args) {
      int[] array1 = {2,4,6,2,5};
      //arr1 {2,6,5}
      //arr2 {4,2}
      int[] array2 = {5,1,1,1,5};
      System.out.println(Arrays.toString(sum(array2)));
      //arr1 {5,1}
      //arr2 {1,5}

  }
}
