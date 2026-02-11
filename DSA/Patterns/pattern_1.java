package DSA.Patterns;
import java.util.*;
public class pattern_1 {
    public static void main(String[] args) {
        char ans;
         Scanner s=new Scanner(System.in);
        do{
        int n=s.nextInt();
        // pattern1(n);
        //  pattern_2(n);
        //  pattern_3(n);
        //  pattern_4(n);
        //  pattern_5(n);
        //  pattern_6(n);
        pattern_7(n);
        pattern_8(n);
        System.out.println("Do you want to Continue the Pattern: ");
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
    public static void pattern_7(int n){
        /*
    *    
   ***   
  *****  
 ******* 
*********
        */
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                num=num+2;

            System.out.println();
        }
    }
    public static void pattern_8(int n){
        /*
    *    
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
        */
       int num = 1;
        int index = 0;
        for (int i = 1; i <= n*2-1; i++) {
            if (i > n) {
                index = i-n;

            } else {
                index = n - i;
            }
            for (int j = 1; j <= index; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= index; j++) {
                System.out.print(" ");
            }
            if (i >= n) {
                num = num - 2;

            } else {
                num = num + 2;
            }
            System.out.println();
        }
    }
    public static void pattern_6(int n){
        int space=2*n-2;
        int limit=0;
        for(int i=1;i<=2*n-1;i++){

           if(i>n){  
            limit=2*n-i;
           }
           else{
            limit=i;
           }
            for(int j=1;j<=limit;j++){
                System.out.print("*");
            }
             
            for(int j=1;j<=space;j++){
                System.out.print(" ");
               
            }
            for(int j=1;j<=limit;j++){
                System.out.print("*");
            }
         if(i<n){
            space-=2;
         }else{
            space+=2;
         }
        
            System.out.println();
        }
    }
}
