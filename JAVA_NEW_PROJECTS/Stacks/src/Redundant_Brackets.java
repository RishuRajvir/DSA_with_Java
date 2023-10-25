import java.util.Stack;

public class Redundant_Brackets {
    public static void main(String[] args) {
        System.out.println(redun("(a + b) + ((c + d))"));
    }

    private static boolean redun(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
                if(ch == ')'){
                    if(st.peek() == '('){
                        return  true;
                    }else {
                        while (st.peek() != '('){
                                st.pop();
                        }
                        st.pop();
                    }

                }else {
                    st.push(ch);
                }

        }
        return false;
    }
}
