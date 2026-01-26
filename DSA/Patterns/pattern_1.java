package DSA.Patterns;
import java.util.*;
public class pattern_1 {
    public static void main(String[] args) {
        char ans;
         Scanner s=new Scanner(System.in);
        do{
        int n=s.nextInt();
        //pattern1(n);
         //pattern_2(n);
         pattern_5(n);
        System.out.println("Continue: ");
         ans=s.next().charAt(0);
        }while(ans=='y');
        s.close();
    }
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern_4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern_5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
