import java.util.LinkedList;
import java.util.Queue;

//create a struct for coordinates
class Coord {
  public int x;
  public int y;
  public int steps;

  public Coord(int y, int x, int steps) {
    this.y = y;
    this.x = x;
    this.steps = steps;

  }
}

public class ShortestPath {


  public static Integer shortestPath(boolean[][] board, Coord start, Coord end, int step) {

    //row length
    int rLength = board[0].length;

    //column length
    int cLength = board.length;
    boolean[][] visited = board;

    //queue to go through all possible routes in maze
    Queue<Coord> routes = new LinkedList<Coord>();

      //add starting coordinate to queues
      routes.offer(start);

      //set the coordinate as visited
      visited[start.y][start.x] = true;

      //while there is a possible route to account for
      while (!routes.isEmpty()) {

        //remove a coordinate from a queue and use it
        Coord path = routes.poll();

        //if route coordinate is the end coordinate, return
        if (path.x == end.x && path.y == end.y) {

          return path.steps;
        }

        //check to see if coordinate above route coordinate is a wall or visited
        if (path.y - 1 >= 0 && !board[path.y-1][path.x] && !visited[path.y-1][path.x]) {

          //mark as visited
          visited[path.y-1][path.x] = true;
          //add coordinate to routes as possible routes to traverse
          routes.offer(new Coord(path.y-1, path.x, path.steps+1));


        }
        //check to see if coordinate to the left of route coordinate is a wall or visited
        if (path.x - 1 >= 0 && !board[path.y][path.x-1] && !visited[path.y][path.x-1]) {


          visited[path.y][path.x-1] = true;
          routes.offer(new Coord(path.y, path.x-1, path.steps+1));

        }

        //check to see if coordinate below route coordinate is a wall or visited
        if (path.y + 1 < cLength && !board[path.y+1][path.x] && !visited[path.y+1][path.x]) {


          visited[path.y+1][path.x] = true;
          routes.offer(new Coord(path.y+1, path.x, path.steps+1));

        }
        //check to see if coordinate to the right of route coordinate is a wall or visited
        if (path.x + 1 < rLength && !board[path.y][path.x+1] && !visited[path.y][path.x+1]) {


          visited[path.y][path.x+1] = true;
          routes.offer(new Coord(path.y, path.x+1, path.steps+1));
        }
      }

        return null;


  }
  public static void main(String[] args) {
    boolean[][] board =
    {{false, false, false, false},
    {true, true, false, true},
    {false, false, false, false},
    {false, false, false, false}};
    int step = 0;
    Coord start = new Coord(0,0,step);
    Coord end = new Coord(3,0,step);

    System.out.println(shortestPath(board, start, end, 0));
  }
}
