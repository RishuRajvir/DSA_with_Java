import java.util.*;
import java.lang.*;
import java.io.*;

public class HistoGram {


    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int ans = Solution.maximumArea(arr);
        System.out.print(ans);
    }
}

class Solution
{
    public static int maximumArea(int[] arr){
        //Your code here
        int[] rg = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rg[arr.length-1] = arr.length;
        for(int i = arr.length-2 ; i>=0; i-- ){
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
                st.pop();
            if(st.isEmpty())
                rg[i] = arr.length;
            else
                rg[i] = st.peek();

            st.push(i);
        }

        int[] rl = new int[arr.length];
        st = new Stack<>();
        st.push(0);
        rl[0] = -1;
        for(int i = 1 ; i<arr.length; i++ ){
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
                st.pop();
            if(st.isEmpty())
                rl[i] = -1;
            else
                rl[i] = st.peek();

            st.push(i);
        }

        //AREA
        int maxArea = 0;
        for(int i = 0; i<arr.length; i++){
            int width = rg[i] - rl[i] - 1;
            int area = arr[i] * width;
            if(area>maxArea)
                maxArea = area;
        }
        return maxArea;

    }
}



