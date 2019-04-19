import java.util.Arrays;
public class RotateArray{
	public static int[] rotate(int[] array, int rotateBy) {
		int length = array.length;

		//if rotateBy greater than length, find and use remainder
		if (rotateBy > length) {
			rotateBy = rotateBy%length;
		}

		//create 2 arrays
		int[] rightArr = new int[rotateBy];
		int[] leftArr = new int[length - rotateBy];

		//let left array equal to left side of array
		for (int i=0;i < leftArr.length;i++) {
			leftArr[i] = array[i];
		}

		//let right array equal to right side of array, starting from left most element
		for (int i = 0 ; i<length-rightArr.length ; i++){
			rightArr[i] = array[length-rightArr.length+i];
		}

		//combine the left and right arrays arrays with the right array on the left
		for (int i = 0 ; i < length ;i++){
			if (i<rightArr.length){
				array[i] = rightArr[i];
			}
			else {
				array[i]=leftArr[i-leftArr.length];
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		System.out.println(Arrays.toString(rotate(array,2)));
	}
}
