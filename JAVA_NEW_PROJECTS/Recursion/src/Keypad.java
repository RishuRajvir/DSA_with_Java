import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

public class Keypad {
    public static void main(String[] args) {
        KPC k1 = new KPC();
//        KPC.keypad(23, "");
        //NEW ARRAY METHOD
        ArrayList<String> ans = k1.keypad1("23");
        Collections.sort(ans);
        for(String i:ans){
//            System.out.println(i);
        }
        String[] ans1 = k1.keypad2(23);
        for(String i:ans1){
            System.out.println(i);
        }
    }


}
class KPC{
    public static void keypad(int n, String output) {
        if (n == 0) {
            System.out.println(output);
            return;
        }
        int last = n % 10;
        int rem = n / 10;
        String[] chars = keys1(last);
        for (String aChar : chars) {
            {
                keypad(rem, aChar + output);
            }

        }
    }
    public static String[] keys1(int n) {
        if (n < 0 || n == 1 || n > 10)
            System.exit(0);
        if (n == 2) {
            return new String[]{"a", "b", "c"};
        } else if (n == 3) {
            return new String[]{"d", "e", "f"};
        } else if (n == 4) {
            return new String[]{"g", "h", "i"};
        } else if (n == 5) {
            return new String[]{"j", "k", "l"};
        } else if (n == 6) {
            return new String[]{"m", "n", "o"};
        } else if (n == 7) {
            return new String[]{"p", "q", "r", "s"};
        } else if (n == 8) {
            return new String[]{"t", "u", "v"};
        } else {
            return new String[]{"w", "x", "y", "z"};
        }
    }
    public  ArrayList<String> keypad1(String str){
            if(str.isEmpty()){
                ArrayList<String>br = new ArrayList<>();
                br.add("");
                return br;
            }
            char ch = str.charAt(0);
            String ros = str.substring(1);
            ArrayList<String>small = keypad1(ros);
            String get = option[ch-'0'];
            ArrayList<String>ans = new ArrayList<>();
           for(int i = 0; i<get.length(); i++){
               for(String a:small){
                   ans.add(get.charAt(i)+a);
               }
           }
            return ans;

    }
    String option[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public String[] keypad2(int n) {
            if(n==0){
                return  new String[]{""};
            }
        int last = n % 10;
        int rem = n / 10;
        String[] chars = keys1(last);
        String[] small = keypad2(rem);
       String[] ans = new String[chars.length*small.length];
       int k = 0;
       for(int i = 0; i<chars.length; i++){
           for(int j = 0; j<small.length; j++){
               ans[k] = small[j]+chars[i];
               k++;
           }
       }
       return ans;
    }
}
