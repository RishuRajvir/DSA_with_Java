import java.util.Scanner;
import java.util.Stack;
public class BalanceParenthesis {
    public static void main(String[] args) {
        System.out.println(checkValidString("((*)"));
    }

    private static boolean isbal(String s) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < s.length(); j++) {
            char i = s.charAt(j);
            if (i == '[' || i == '{' || i == '(') {
                stack.push(i);
            } else if (i == ']' || i == '}' || i == ')') {
                if (stack.isEmpty())
                    return false;

                else {
                    if (i == ']') {
                        if (stack.peek() != '[')
                            return false;
                        else
                            stack.pop();
                    } else if (i == '}') {
                        if (stack.peek() != '{')
                            return false;
                        else
                            stack.pop();
                    } else if (i == ')') {
                        if (stack.peek() != '(')
                            return false;
                        else
                            stack.pop();
                    }
                }
            }

        }
        return stack.isEmpty();
    }

    private static boolean isbal2(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(')
            {
                stack.push(ch);
            }
            else if (ch == ']' || ch == '}' || ch == ')')
            {
                if (stack.isEmpty())
                    return false;
                else
                {
                    if (ch == ']')
                    {
                        if (stack.peek() != '[')
                            return false;
                        else
                            stack.pop();
                    }
                    else if (ch == '}')
                    {
                        if (stack.peek() != '{')
                            return false;
                        else
                            stack.pop();
                    }
                    else if (ch == ')')
                    {
                        if (stack.peek() != '(')
                            return false;
                        else
                            stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean checkValidString( String s){
        //write code here
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftStack.push(i);
            } else if (c == '*') {
                starStack.push(i);
            } else {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false; // No matching '(' or '*' found
                }
            }
        }

        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            if (leftStack.pop() > starStack.pop()) {
                return false; // '*' appears after '('
            }
        }

        return leftStack.isEmpty();
    }
}

