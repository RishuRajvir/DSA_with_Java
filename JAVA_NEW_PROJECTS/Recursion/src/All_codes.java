public class All_codes {
    public static void main(String[] args) {
            codes("123",0,"");

    }
    public  static void codes(String str,int i,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        if(ch=='0')
            return;
        char alpha = (char)(ch-'0'+96);
        codes(str,i+1,ans+alpha);
        if(i==str.length()-1)
                return;
        String no = str.substring(i,i+2);
        int num = Integer.parseInt(no);
        char alpha1 = (char)(num+96);
        if(num<=26){
            codes(str,i+2,alpha1+ans);
        }

    }
}
