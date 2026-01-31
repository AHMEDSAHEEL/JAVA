import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        String str = "Ahmed Saheel";
        TreeMap<Character, Integer> hm = new TreeMap<>();

        for (char c : str.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        // System.out.println(hm);

        // first Method:

        // for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
        // System.out.println("Character: " + entry.getKey() + ", Count: " +
        // entry.getValue());
        // }

        // second Method:
        // Iterator<Map.Entry<Character,Integer>> entry=hm.entrySet().iterator();

        // while(entry.hasNext()){
        // Map.Entry<Character,Integer> iter=entry.next();
        // System.out.println(iter.getKey()+" "+iter.getValue());
        // }

        // third Method:
        hm.forEach((key, value) -> System.out.println(key + " " + value));

    }
}