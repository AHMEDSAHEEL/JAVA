package JAVA_PRA_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;


class PrimeExceptionFound extends Exception{
    public PrimeExceptionFound(String msg){
        super(msg);
    }
}
public class primeException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        ArrayList<Integer>al=new ArrayList<>();

        for(int i=0;i<n;i++){
            al.add(s.nextInt());
        }

        for(int i:al){
                try{
                if(checkPrime(i)){
                    throw new PrimeExceptionFound(i+" is Prime Number");
                }else{
                    System.out.println(i);
                }
            }catch(PrimeExceptionFound p){
                System.out.println(p.getClass().getSimpleName()+": "+p.getMessage());
            }
        }
    }

    public static boolean checkPrime(int num){
    
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
          
        }
       
        return true;

    }
}
