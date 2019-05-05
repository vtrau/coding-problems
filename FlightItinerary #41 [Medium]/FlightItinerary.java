import java.util.HashMap;
import java.util.Arrays;

//create a class to have access to start and destination locations
class Flight {
  public String start;
  public String destination;

  public Flight(String start, String destination) {
    this.start = start;
    this.destination = destination;

  }
}
public class FlightItinerary {

  public static String[] compute(Flight[] array, String start) {
    String[] result = new String[array.length + 1];
    HashMap<String,String> fromTo = new HashMap<String,String>();
    //create a hashmat with the starting location as the key and destination as the key's value
    for (int i = 0; i < array.length; i++) {
      fromTo.put(array[i].start, array[i].destination);

    }
    result[0] = start;
    //use the starting location as the key to find destination in HashMap, which is allocated to result array
    //change start variable value to destination and repeat
    for (int i = 1; i <= fromTo.size(); i++) {
      result[i] = fromTo.get(start);
      start = fromTo.get(start);

    }

    if (result[array.length] == null) {
      return null;
    }
    else {

    return result;
    }
  }
  public static void main(String[] args) {
    Flight[] flights = {new Flight("SFO", "HKO"), new Flight("YYZ", "SFO"), new Flight("YUL", "YYZ"), new Flight("HKO", "ORD")};
    System.out.println(Arrays.toString(compute(flights, "YUL")));
    Flight[] flights2 = {new Flight("SFO", "COM"), new Flight("COM", "YYZ")};
    System.out.println(Arrays.toString(compute(flights2, "COM")));

  }
}
