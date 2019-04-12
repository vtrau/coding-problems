import java.util.LinkedList;

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

    int rLength = board[0].length;
    int cLength = board.length;
    boolean[][] visited = board;
    LinkedList<Coord> routes = new LinkedList<Coord>();





      routes.offer(start);
      visited[start.y][start.x] = true;
      while (!routes.isEmpty()) {

        Coord path = routes.pollFirst();

        if (path.x == end.x && path.y == end.y) {

          return path.steps;
        }



        if (path.y - 1 >= 0 && !board[path.y-1][path.x] && !visited[path.y-1][path.x]) {


          visited[path.y-1][path.x] = true;

          routes.offer(new Coord(path.y-1, path.x, path.steps+1));


        }
        if (path.x - 1 >= 0 && !board[path.y][path.x-1] && !visited[path.y][path.x-1]) {


          visited[path.y][path.x-1] = true;
          routes.offer(new Coord(path.y, path.x-1, path.steps+1));

        }

        if (path.y + 1 < cLength && !board[path.y+1][path.x] && !visited[path.y+1][path.x]) {


          visited[path.y+1][path.x] = true;
          routes.offer(new Coord(path.y+1, path.x, path.steps+1));

        }
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
