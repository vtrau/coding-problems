public class MaxProfit {
  public static int profit(int[] stockPrices) {

    //if array length is less than two, throw an error
    if (stockPrices.length < 2) {
      throw new ArrayIndexOutOfBoundsException("Length is less than 2, Cannot calculate profit");
    }

    //minimum price is the first element of array
    int min = stockPrices[0];
    //max profit can be negative if price never goes up
    int maxProfit = stockPrices[1] - stockPrices[0];
    for (int i = 1; i  < stockPrices.length; i++) {
      //setting minimum price
      if (stockPrices[i] < min) {
        min = stockPrices[i];
      }
      //setting max profit
      else if (stockPrices[i] - min > maxProfit) {
        maxProfit = stockPrices[i] - min;
      }
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    int[] array = {9,11,8,5,7,10};
    System.out.println(profit(array));
  }
}
