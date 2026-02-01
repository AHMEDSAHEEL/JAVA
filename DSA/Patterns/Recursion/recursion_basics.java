package DSA.Patterns.Recursion;

public class recursion_basics {
    public static void main(String args[]){
     System.out.println( fact(5));
    num(5,1);
    nums(5);
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }

    public static void num(int n,int i){
      if(n<1){
        return;
      }

      System.out.println(i); 
      num(n-1,i+1);
    }
    public static void nums(int n){
      if(n<1){
        return;
      }

      System.out.println(n); 
      nums(n-1);
    }
    
}
