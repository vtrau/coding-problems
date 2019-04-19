import java.util.Stack;
import java.util.LinkedList;

public class BalancedBrackets {
  public static boolean balanced(String str) {
    //time complexity O(N), 1 for loop
    //space complexity O(N), worse case stack is full of opening characters

    //create a stack
    Stack<Character> stack = new Stack<Character>();

    //iterate through all chracters of string
    for (int i = 0; i < str.length; i++) {
      //char1 is char from an index at String
      //charQ is an opening character popped from stack
      Character char1 = str.charAt(i);
      Character charQ = ' ';
      if (!stack.isEmpty()) {
        charQ = stack.peek();
      }

      //add to stack if char1 is opening character
      if (char1 == '{' || char1 == '[' || char1 == '(') {
        stack.push(char1);
      }

      //pop from stack if char1 is closing character and corresponds
      //with correct opening chracter, charQ, from stack
      if (charQ == '{' && char1 == '}') {
        stack.pop();
      }
      else if (charQ == '(' && char1 == ')') {
        stack.pop();
      }
      else if (charQ == '[' && char1 == ']') {
        stack.pop();
      }
    }

    //if stack is empty, all brackets, parentheses, and brackets have been accounted for
    if (stack.isEmpty()) {
      return true;
    }
    else {
      return false;
    }
  }
  public static void main(String[] args) {
    System.out.println("Hello World");
    String str1 = "([)]";
    String str2 = "((()";
    String str3 = "([])[]({})";
    System.out.println(balanced(str1));
    System.out.println(balanced(str2));
    System.out.println(balanced(str3));
  }
}
