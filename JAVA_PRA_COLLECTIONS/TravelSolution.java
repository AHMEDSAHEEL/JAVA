import java.util.*;

public class TravelSolution {
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
  int n=s.nextInt();
    ArrayList<TravelAgency>al=new ArrayList<>();

    for(int i=0;i<n;i++){
    int regNo=s.nextInt();s.nextLine();
    String agencyName=s.nextLine();
    String packageType=s.nextLine();
    int price=s.nextInt();
    boolean flightFacility=s.nextBoolean();
    al.add(new TravelAgency(regNo, agencyName, packageType, price, flightFacility));
    }
    int max=findHighestPrice(al);

    System.out.println(max);

 }   

 public static int findHighestPrice(ArrayList<TravelAgency> al) {
    return al.stream()
             .max(Comparator.comparingInt(TravelAgency::getPrice))
             .map(TravelAgency::getPrice)
             .orElse(0);

              //.orElseThrow(() -> new RuntimeException("List is empty"));
}


}
class TravelAgency{
    private int regNo;
    private String agnecyName;
    private String packageType;
    private int price;
    private boolean flightFacility;
    
    public TravelAgency(int regNo, String agnecyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agnecyName = agnecyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgnecyName() {
        return agnecyName;
    }

    public void setAgnecyName(String agnecyName) {
        this.agnecyName = agnecyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
      
    
}
