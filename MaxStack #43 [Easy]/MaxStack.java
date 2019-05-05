public class MaxStack {
  static class LinkedListStack {
    public int max;
    Node root;


    class Node {
      int data;
      Node next;
      Node(int data) {
        this.data = data;
      }
    }
    //if empty, set new node as root node

    //if pushed value is greater than current max, set node value as value+max so it is the highest
    //this distinguishes the node so replacing the popped max with old max becomes possible

    //else just push as normal
    public void push(int value) {
      Node newNode = new Node(value);
      if (root == null) {
        root = newNode;
        max = value;
      }

      else if (value > max) {
        Node temp = root;
        newNode.data = value + max;
        root = newNode;
        newNode.next = temp;
        max = value;
      }
      else{
        Node temp =root;
        root = newNode;
        newNode.next = temp;
      }
    }

    //if empty, return exception

    //if the node's data is greater than the max, pop the node and replace it with old max

    //else just pop as normal
    public int pop() {
        int popped = 0;
        if (root == null) {
          throw new NullPointerException("Stack is empty");
        }
        else if (root.data > max) {
          popped = root.data;
          max = popped - max;
          root = root.next;

        }
        else {
          popped = root.data;
          root = root.next;
        }
        return popped;
    }

    public int max() {
      return max;
    }



  }

  public static void main(String[] args) {
    LinkedListStack s = new LinkedListStack();
    s.push(3);
    s.push(5);

    s.push(2);
    s.push(1);

    System.out.println(s.pop());

    System.out.println(s.pop());
    System.out.println(s.max());
    System.out.println(s.pop());
    System.out.println(s.max());

  }
}
