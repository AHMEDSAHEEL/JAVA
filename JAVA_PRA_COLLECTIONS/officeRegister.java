import java.util.*;
public class officeRegister {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashMap<String ,String> hm=new HashMap<>();
        int n=s.nextInt();s.nextLine();

        for(int i=0;i<n;i++){
            hm.put(s.nextLine(),s.nextLine());
        }
String employeName=s.nextLine();
int count=0;
    for(Map.Entry<String,String> entry:hm.entrySet()){
        if(employeName.equals(entry.getKey())){
            System.out.println(entry.getValue());
            count++;
        }
    }

    if(count==0){
        System.out.println("Employee not found");
    }
    }
}
