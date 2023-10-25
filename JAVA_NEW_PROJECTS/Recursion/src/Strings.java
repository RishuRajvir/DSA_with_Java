import java.lang.String;
import java.util.ArrayList;
import  java.lang.*;
public class Strings {
    public static void main(String[] args)
    {
        String str = "axaxaxax";
         print(str);
         str = str.toLowerCase();
         System.out.println(palin(str,0,str.length()-1));
         System.out.println("Original String ->>\t"+str);
        System.out.println(removeX(str));
        System.out.println(replace(str,'o'));
         System.out.println(Pi(str));
         System.out.println(Pair(str));
         System.out.println(duplicates(str));
         subsequence obj = new subsequence();
         obj.ssq("abc","");
         System.out.println(obj.getssq("abc"));
         Keypad obj1 = new Keypad();
         obj1.KPC(23,"");
         ArrayList<String> arr = obj1.KPC2("23");
         System.out.println();
         System.out.println(arr);
         System.out.println();
         String[] ans =  obj1.KPC(234);
        for (String an : ans) {
            System.out.print(an + " ");
        }
         permutation obj2 = new permutation();
         obj2.Permute("abc", "");
         String []ans1 =obj2.Permute("abc");
        for (String s : ans1) {
            System.out.println(s);
        }
         ArrayList<String> arr1 = obj2.permute("abc");
         System.out.println(arr1);
        encode("123", 0, "");

    }
    public static void encode(String str, int i, String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        if(ch =='0'){
            return;
        }
        char alpha = (char)(ch-'0'+96);
        encode(str, i+1, ans+alpha);

        if((i==(str.length()-1))){
            return;
        }
        String no = str.substring(i,i+2);
        int num = Integer.parseInt(no);
        char alpha1 = (char)(num+96);
        if(num<=26){
            encode(str, i+2, ans+alpha1);
        }
    }
    static class permutation{
        public void Permute(String str, String output){
            if(str.isEmpty()){
                System.out.print(output+" ");
                return;
            }
            for(int i = 0; i<str.length(); i++){

                char ch = str.charAt(i);
                String rest = str.substring(0,i) + str.substring(i+1);
                Permute(rest, output+ch);
            }
        }
        public String[] Permute(String str){
            if(str.isEmpty()){
                return new String[]{""};
            }
            String[] small = Permute(str.substring(1));
            String[] output = new String[small.length*str.length()];
            int k =0;
            for(int i = 0; i<small.length; i++){
                String temp = small[i];
                for(int j = 0; j<=temp.length(); j++){
                    output[k] = temp.substring(0,j) + str.charAt(0) + temp.substring(j);
                    k++;
                }
            }
            return output;

        }
        public ArrayList<String> permute(String str){
            if(str.isEmpty()){
                ArrayList<String> br = new ArrayList<>();
                br.add("");
                return br;
            }
            ArrayList<String> myres = new ArrayList<>();
            char ch = str.charAt(0);
            ArrayList<String>res = permute(str.substring(1));
            for(String rrs :res){
                for(int i = 0; i<=rrs.length(); i++){
                    String val = rrs.substring(0,i)+ch+rrs.substring(i);
                    myres.add(val);
                }
            }
            return myres;
        }

    }
    static class Keypad{
        String[] options ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        public  String[] letter(int n){
            if(n<0||n==1||n>10)
                System.exit(0);
            if(n==2){
                return new String[]{"a","b","c"};
            }
            else if(n==3){
                return new String[]{"d","e","f"};
            }
            else if(n==4){
                return new String[]{"g","h","i"};
            }
            else if(n==5){
                return new String[]{"j","k","l"};
            }
            else if(n==6){
                return new String[]{"m","n","o"};
            }
            else if(n==7){
                return new String[]{"p","q","r","s"};
            }
            else if(n==8){
                return new String[]{"t","u","v"};
            }
            else{
                return new String[]{"w","x","y","z"};
            }
        }
        public  void KPC(int n, String output) { //SIMPLY PRINTS AND RETURN
            if(n==0){
                System.out.print(output+" ");
                return;
            }
            int last = n%10;
            int remain = n/10;
            String getletters = options[last];
            for(int i = 0; i<getletters.length();i++){
                KPC(remain, getletters.charAt(i)+output);
            }
        }
        public  String[] KPC(int n){  // RETURN AN ARRAY
            if(n == 0){
                return new String[]{""};
            }
            int last = n%10;
            int remain = n/10;
            String getletters[] = letter(last);
            String smallans[] = KPC(remain);

            String[] output = new String[smallans.length*getletters.length];
            int k = 0;
            for (String getletter : getletters) {
                for (String smallan : smallans) {
                    output[k] = smallan + getletter;
                    k++;
                }
            }
            return output;
        }
        public  ArrayList<String> KPC2(String  str){  // RETURN AN ARRAYLIST
            if(str.isEmpty()){
                ArrayList<String>arr = new ArrayList<>();
                arr.add("");
                return arr;
            }
            char first = str.charAt(0);
            String remain = str.substring(1);
            String getletters = options[first-'0'];
            ArrayList<String> small = KPC2(remain);

            ArrayList<String>output = new ArrayList<>();
            for(int i = 0; i<getletters.length(); i++){
                for(String a: small)
                    output.add(getletters.charAt(i)+a);
            }
            return output;
        }
    }
    static class subsequence{
        private  ArrayList<String> getssq(String str) { //New Array Method
            if(str.isEmpty()){
                ArrayList<String> ans = new ArrayList<>();
                ans.add("");
                return ans;
            }
            ArrayList<String> res = getssq(str.substring(1));
            ArrayList<String> myres = new ArrayList<>();
            for(String i:res)
                myres.add(str.charAt(0)+i);
            for(String i:res)
                myres.add(i+"");
            return myres;

        }
        private  String[] getssq2(String str) { //OLD ARRAY METHOD
            if(str.isEmpty()){
                return new String[]{""};
            }
            String smallans[] = getssq2(str.substring(1));
            String myres[] = new String[2*smallans.length];
            for(int i = 0; i<smallans.length; i++){
                myres[i]=str.charAt(0)+smallans[i];
            }
            for(int i = 0; i<smallans.length; i++){
                myres[i+smallans.length]=smallans[i];
            }

            return myres;


        }

        private  void ssq(String str , String ans) {
            if(str.isEmpty()){
                System.out.println(ans);
                return;
            }
            ssq(str.substring(1), ans+str.charAt(0));
            ssq(str.substring(1), ans);
        }


    }

    private static String duplicates(String str)
    {
        if(str.length()<=1)
            return str;
        if(str.charAt(0)==str.charAt(1))
            return duplicates(str.substring(1));
        else
            return str.charAt(0)+duplicates(str.substring(1));
    }

    private static String Pair(String str) {
        if(str.length() <= 1)
            return str;
        String ans = Pair(str.substring(1));
        if(str.charAt(0)==ans.charAt(0)){
            return str.charAt(0) +"*"+ ans;
        }
        else{
            return str.charAt(0)+ans;
        }

    }


    private static String Pi(String str) {
        if(str.length()<=1)
            return str;
        String ans = Pi(str.substring(1));
        if(str.charAt(0)=='p'){
            if(ans.charAt(0)=='i'){
                return "3.14"+ans.substring(1);
            }
            else
                return str.charAt(0)+ans;
        }
        else{
            return   str.charAt(0)+ans;
        }

    }

    private static String replace(String str, char c) {
        if(str.isEmpty())
            return str;
        String ans ="";
        if(str.charAt(0)=='x'){
            ans +=c;
        }
        else
            ans+=str.charAt(0);
        return ans+replace(str.substring(1), c);
        //    return ans+small;
    }

    private static String removeX(String str) {
        if(str.isEmpty())
            return str;
        String ans = "";
        if(str.charAt(0)!='x')
            ans += str.charAt(0);
        String small  = removeX(str.substring(1));
        return ans + small;
    }

    private static boolean palin(String str, int i, int length) {
        if(i>length)
            return true;
        if(str.charAt(i)!=str.charAt(length))
            return false;
        return palin(str, i+1, length-1);
    }

    private static String rev(String str) {
        if(str.isEmpty()){
            return "";
        }
        String ans = null;
        ans = rev(str.substring(1));
        char ch = str.charAt(0);
        return ans+ch;
    }

    private static void print(String str ) {
        if(str.isEmpty())
            return;
        System.out.print(str.charAt(0));
        print(str.substring(1));
    }

}
