import java.util.Arrays;

public class sumOfNonAdjacent {
  public static int[] sum(int[] array) {
    int length = array.length;
<<<<<<< Problem9
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
=======
    int adjacentLength = length/2;
    int[] arr2 = new int[adjacentLength];
    if (adjacentLength%2 == 1) {
    adjacentLength++;
    }
    int[] arr1 = new int[adjacentLength];
    int index = 0;
    for (int i = 0; i < length; i = i+2) {
        arr1[i] = arr[index];
        index++;
>>>>>>> master
    }
    for (int i = 1; i < length; i = i + 2) {
      arr2[i] = arr[index];
      index++;
    }


<<<<<<< Problem9
    for (int i = 0; i < array1.length; i++) {
      int number;
      int number1 = array1[i];
      int number2 = array2[i];
      int number3 = array1[i+1];
      int number4 = array2[i+1];
=======
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      int number = 0;
      int number1 = arr1[i]; //number3 and number4
      int number2 = arr2[i]; //number 4

      else if () {
      
      }
      else {
      int number3 = arr1[i+1];
      int number4 = arr2[i+1];

>>>>>>> master
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


  }
}
