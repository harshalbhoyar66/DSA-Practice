public class LongestSubstring {

    //1. we need to Create method for managing the SubString

   public static String longestSub(String str){

       int maxlength=0;
       String newsub="",sub="";

       for(int i=0;i<str.length()-1;i++){
           for(int j=i+1;j<str.length()-1;j++){
             sub=str.substring(i,j+1);
             if(isPlaindrome(sub) && sub.length()>maxlength){
                 newsub=sub;
                 maxlength=sub.length();
             }
           }
       }





       return newsub;

    }


    public static boolean isPlaindrome(String s){

       int left=0,right=s.length()-1;
       while(left<right){
           if(s.charAt(left)!=s.charAt(right)){
               return false;
           }
           left++;
           right--;
       }

       return true;
    }
public  static void main (String args[]){
       String a="lacalda";
       String res=longestSub(a);
       System.out.println(res);
}

}
