import  java.lang.String;
import  java.util.*;
public class Subseq {
    public static void main(java.lang.String[] args){
            subsequent s1 = new subsequent();
            s1.subseq("abc",""); //Print Only function

            //Return With Old Array
            String[] ans = s1.subseq("abc");
               Arrays.sort(ans);
            for(String i:ans){
                System.out.println(i);
            }
            //Return With New ArrayList
        ArrayList<String> str = new ArrayList<>();
            str = s1.subseq1("abc");
            Collections.sort(str);
           for(String i :str){
               System.out.println(i);
           }


    }
    }
    class subsequent{
        public void subseq(String abc,String s) {
            if(abc.isEmpty()){
                System.out.println(s);
                return;
            }
            subseq(abc.substring(1), s+abc.charAt(0));
            subseq(abc.substring(1), s);
        }

        public String[] subseq(String abc) {
                    if(abc.isEmpty()){
                        return new String[]{""};
                    }
                    String[] small = subseq(abc.substring(1));
                    String[] ans = new String[2*small.length];
                    int k = 0;
                    for(int i = 0; i<small.length; i++){
                            ans[k] =abc.charAt(0)+ small[i];
                            k++;
                    }
                     for(int i = 0; i<small.length; i++){
                            ans[k] = small[i];
                            k++;
                    }
                    return ans;
        }

        public ArrayList<String> subseq1(String abc) {
                if(abc.isEmpty()){
                    ArrayList<String> br = new ArrayList<>();
                    br.add("");
                    return br;
                }
                ArrayList<String> small = subseq1(abc.substring(1));
                ArrayList<String> ans = new ArrayList<>();
                for(String i:small){
                    ans.add(abc.charAt(0)+i);
                }
                for(String i:small){
                ans.add(i);
            }
                return ans;
        }
    }


