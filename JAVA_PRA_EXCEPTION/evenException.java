package JAVA_PRA_EXCEPTION;

import java.util.*;

public class evenException{
    public static void main (String args[]){
        
       Scanner s=new Scanner(System.in); 
       int n=s.nextInt();
       
       LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
       
       for(int i=0;i<n;i++){
           int num=s.nextInt();
            boolean even=isEven(num);
            if(even){
           lhs.add(num);
          
            }
       }
   
       double avg=0;
      try{
           if(lhs.isEmpty()){
              throw new NoFoundException("Even Integers Not Available"); 
           }
           else{
           for(int i:lhs){
              
                   avg+=i;
                   
              
           }
             System.out.println(avg/lhs.size());
          }
         }catch(NoFoundException e){
             System.out.println(e.getClass().getSimpleName()+": "+e.getMessage());
         }
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
class NoFoundException extends Exception{
    public NoFoundException(String msg){
        super(msg);
    }
}