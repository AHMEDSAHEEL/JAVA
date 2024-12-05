import java.util.*;

public class patAndDoc{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        ArrayList<Doctor> dl=new ArrayList<>();
      
        
        for(int i=0;i<n;i++){
            int docId=s.nextInt();s.nextLine();
            String docName=s.nextLine();
            String spec=s.nextLine();
            int patCount=s.nextInt();
              ArrayList<Patient> pl=new ArrayList<>();
              for(int j=0;j<patCount;j++){
                  int patId=s.nextInt();s.nextLine();
                  String patName=s.nextLine();
                  String illness=s.nextLine();
                  pl.add(new Patient(patId,patName,illness));
              }
              dl.add(new Doctor(docId,docName,spec,pl));
        }
        int uniqIllId=s.nextInt();s.nextLine();
        String givenSpec=s.nextLine();
        TreeSet<String> ans1=find(dl,uniqIllId);
        
        if(ans1.isEmpty()){
            System.out.println("Doctor Not Found");
        }else{
            for(String i:ans1){
                System.out.println(i);
            }
        }
        ArrayList<String> ans2=findDocName(dl,givenSpec);
        if(ans2.isEmpty()){
            System.out.println("No Doctors Found");
        }else{
            for(String i:ans2){
                System.out.println(i);
            }
        }
    }
    
    public static TreeSet<String> find(ArrayList<Doctor> dl,int uniqIllId){
        
        TreeSet<String> ts=new TreeSet<>();
       // boolean flag=false;
        for(Doctor i:dl){
            
            if(i.getDocId()==uniqIllId){
                
                for(Patient pat:i.getPatDetaiils()){
                    ts.add(pat.getIll());
                    //flag=true;
                }
                // if(flag){
                //     break;
                // }
                break;
            }
        }
        
        return ts;
    }
    
    public static ArrayList<String> findDocName(ArrayList<Doctor> dl,String givenSpec){
        ArrayList<String> al=new ArrayList<>();
        
        for(Doctor ans:dl){
            if(ans.getSpec().equals(givenSpec)){
                al.add(ans.getDocName());
            }
        }
        return al;
    }
}

class Doctor{
    private int docId;
    private String docName;
    private String spec;
    private ArrayList<Patient> pl;
    public Doctor(int docId, String docName,String spec,ArrayList<Patient> pl){
        this.docId=docId;
        this.docName=docName;
        this.spec=spec;
        this.pl=pl;
    }
    
     public int getDocId(){
         return this.docId;
     }
     public String getDocName(){
         return this.docName;
     }
     public String getSpec(){
         return this.spec;
     }
     public ArrayList<Patient> getPatDetaiils(){
         return this.pl;
     }
}
class Patient{
    private int patId;
    private String patName;
    private String illness;
    
      public Patient(int patId,String patName,String illness){
          this.patId=patId;
          this.patName=patName;
          this.illness=illness;
      }
      public int getPatId(){
          return this.patId;
      }
      public String getPatName(){
          return this.patName;
          
      }
      public String getIll(){
          return this.illness;
      }
}