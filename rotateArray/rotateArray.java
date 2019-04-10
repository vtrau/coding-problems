import java.util.Arrays;
public class rotateArray{
	public static int[] rotate(int[] array, int rotateBy) {
		int length = array.length;
		int[] rightArr = new int[rotateBy];
		int[] leftArr = new int[length - rotateBy];
		for (int i=0;i < leftArr.length;i++) {
			leftArr[i] = array[i];
		}
		for (int i = 0 ; i<length-rightArr.length ; i++){
			rightArr[i] = array[length-rightArr.length+i];
		}
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
