package JAVA_PRA_EXCEPTION;

import java.util.*;

public class palindromeException
{
	public static void main(String[] args) {
	  ArrayList<String> al=new ArrayList<>();
	  Scanner s= new Scanner(System.in);
	  int n=s.nextInt();
	  s.nextLine();
	  
	  for(int i=0;i<n;i++){
	      String str=s.nextLine();
	      al.add(str);
	  }
	  
	  for(String str:al){
	      String rev=palindrome(str);
	       try{
	         if(rev.equals(str)){
	           throw new PalindromeExceptions("Number is Palindrome");   
	         }else{
	          System.out.println(rev);
	         }
	        }catch(PalindromeExceptions e){
	          System.out.println(e.getClass().getSimpleName()+": "+e.getMessage());
	        }
	  }
   }
	
	public static String palindrome(String str){
	    String res="";
	    for(int i=0;i<str.length();i++){
	        res=str.charAt(i)+res;
	    }
	    return res;
	}
}
class PalindromeExceptions extends Exception{
    public PalindromeExceptions(String msg){
        super(msg);
    }
}