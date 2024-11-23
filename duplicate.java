import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        String str="Ahmed Saheel";
        HashMap<Character,Integer>hm=new HashMap<>();

        for(char c: str.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
   //System.out.println(hm);
     
   for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
    System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
}

    }
}
