import java.util.*;

public class Test {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] operation =new String[n];
        for(int i=0;i<n;i++)
            operation[i]=sc.next();

        Solutions obj=new Solutions();

        System.out.println(obj.solve(operation,n));

        sc.close();
    }
}

class Solutions {

    int solve(String[] str, int n) {
        // Add your code here.
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++){
            if(Objects.equals(str[i], "C")){
                st.pop();
            }else if(Objects.equals(str[i], "D")){
                st.push(2*st.peek());
            }else if(Objects.equals(str[i], "+")){
                int last = st.pop();
                int seclast = st.peek();
                st.push(last);
                st.push(last + seclast);
            }else{
                int nn = Integer.parseInt(str[i]);
                st.push(nn);
            }
        }
        int sum = 0;
        for(int elem :st){
            sum+=elem;
        }
        return sum;
    }
}
