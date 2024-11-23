import java.io.*;

public class oddEven {

    public static void main(String[] args) {
        int n=9;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i +" is Even");
            }else{
                System.out.println(i+" is Odd");
            }
        }
    }
}