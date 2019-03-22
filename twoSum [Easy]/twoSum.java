import java.util.Arrays;
public class twoSum {

  public static int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[] { i, j };
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
  public static void main(String[] args) {


      int[] array = {1, 4, 45, 6, 10, -8};
      int n = 16;
      System.out.println(Arrays.toString(twoSumBruteForce(array, n)));
  }
}
