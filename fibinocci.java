public class fibinocci {
 public static void main(String[] args) {
    int first=0,second=1,next=0;


    for(int i=0;i<5;i++){
        next=first+second;
        System.out.println(first);
        first=second;
        second=next;
    }
 }   
}
