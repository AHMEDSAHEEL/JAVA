public class palindorme {
    public static void main(String[] args) {
        String orgStr="mam";
        String str="";
int x=-121;
          int n=x,rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
         if(x==rev){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        // for(int i=0;i<orgStr.length();i++){
        //     str=orgStr.charAt(i)+str;
        // }

        // if ((orgStr.equals(str))) {
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
    }
}
