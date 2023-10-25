import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
            permute("abc","");
        ArrayList<String>arr =   permute1("abc");
        System.out.println(arr);
    }

    private static ArrayList<String> permute1(String abc) {
            if(abc.isEmpty()){
                ArrayList<String>br = new ArrayList<>();
                br.add("");
                return br;
            }
            ArrayList<String> ans = new ArrayList<>();
            char ch = abc.charAt(0);
            ArrayList<String> small = permute1(abc.substring(1));
        for (String temp:small){
            for (int j = 0; j <=temp.length(); j++) {
                String val = temp.substring(0,j)+ch+temp.substring(j);
                ans.add(val);
            }

    }
        return ans;



    }

    public static void permute(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<str.length(); i++){
                String str1 = str.substring(0,i);
                String str2 = str.substring(i+1);
                permute(str1+str2,ans+str.charAt(i));
        }
    }
}
