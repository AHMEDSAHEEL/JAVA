public class palindorme {
    public static void main(String[] args) {
        String orgStr="mam";
        String str="";
        for(int i=0;i<orgStr.length();i++){
            str=orgStr.charAt(i)+str;
        }

        if ((orgStr.equals(str))) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
