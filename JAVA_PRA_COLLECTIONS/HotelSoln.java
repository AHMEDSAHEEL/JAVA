import java.util.*;
public class HotelSoln{
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Hotel>al=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int roomno=s.nextInt();s.nextLine();
            String roomType=s.nextLine();
            int capacity=s.nextInt();
            double pricePerNight=s.nextDouble();
            boolean isAvailable=s.nextBoolean();
            
            al.add(new Hotel(roomno,roomType,capacity,pricePerNight,isAvailable));
            
        }
        
        int roomId=s.nextInt();
        ArrayList<Hotel> res1=roomBookingByRoomNo(al,roomId);
        
        if(res1 !=null){
           for(Hotel hh:res1){
            System.out.println("Room No: "+hh.getRoomNo()+"\nRoom Type: "+hh.getRoomType()+"\nCapacity: "+hh.getCapacity()+
            "\nPrice: "+hh.getPricePerNight());
            }
        }else{
            System.out.println("No room found with given attributes");
        }
        Hotel res2=maxRoomCapacity(al);
        
        if(res2 !=null){
           
            System.out.println("Room No: "+res2.getRoomNo()+"\nRoom Type: "+res2.getRoomType()+"\nCapacity: "+res2.getCapacity()+
            "\nPrice: "+res2.getPricePerNight());
         
        }else{
            System.out.println("Rooms are not available");
        }
    }
    public static ArrayList<Hotel> roomBookingByRoomNo(ArrayList<Hotel> al,int roomId){
        ArrayList<Hotel> ans=new ArrayList<>();
        
        for(Hotel h: al){
            if(roomId==h.getRoomNo()&& h.getIsAvailable()){
                h.setIsAvailable(false);
                ans.add(h);
                
            }
        }
        return ans.isEmpty()?null:ans;
    }
    public static Hotel maxRoomCapacity(ArrayList<Hotel> al){
        return al.stream()
             .filter(Hotel::getIsAvailable)
             .max(Comparator.comparingInt(Hotel::getCapacity))
             .orElse(null);
    }
}

class Hotel{
    private int roomno;
    private String roomType;
    private int capacity;
    private double pricePerNight;
    private boolean isAvailable;
      public Hotel(int roomno,String roomType,int capacity,double pricePerNight,boolean isAvailable)
      {
          this.roomno=roomno;
          this.roomType=roomType;
          this.capacity=capacity;
          this.pricePerNight=pricePerNight;
          this.isAvailable=isAvailable;
      }
      
      public int getRoomNo(){
          return this.roomno;
      }
      public void setRoomNo(int roomno){
          this.roomno=roomno;
      }
      
      public String getRoomType(){
          return this.roomType;
      }
      public void setRoomType(String roomType){
          this.roomType=roomType;
      }
      public int getCapacity(){
          return this.capacity;
      }
      public void setCapacity(int capacity){
          this.capacity=capacity;
      }
      public double getPricePerNight(){
          return this.pricePerNight;
      }
      public void setPricePerNight(double pricePerNight){
          this.pricePerNight=pricePerNight;
      }
      public boolean getIsAvailable(){
          return this.isAvailable;
      }
      public void setIsAvailable(boolean isAvailable){
          this.isAvailable=isAvailable;
      }
}