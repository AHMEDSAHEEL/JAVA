import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class smartPhoneSolution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        ArrayList<smartPhone>al=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            int productId=s.nextInt();s.nextLine();
            if(hs.contains(productId)){
              System.out.println("dulicate prodId not allowed");
              return;
            }
            hs.add(productId);
           String brandName=s.nextLine();
           String ROM=s.nextLine();
           double price=s.nextDouble();
           al.add(new smartPhone(productId, brandName, ROM, price));
        

        }
        s.nextLine();

        String findbrandName=s.nextLine();
        int start=s.nextInt();
        int end=s.nextInt();

        ArrayList<smartPhone> res1=findByBrandName(al,findbrandName);
        if(res1 != null){
            for(smartPhone sm:res1){
                System.out.println(sm.getProductId()+"\n"+sm.getBrandName()+"\n"+sm.getROM()+"\n"+sm.getPrice());
            }
        }else{
            System.out.println("No mobile found with mentioned brand.");
        }
        List<smartPhone> res2=findSmartPhoneByPriceRange(al,start,end);
        if(res2 != null){
            for(smartPhone sm:res2){
                System.out.println(sm.getBrandName()+"\n"+sm.getROM()+"\n"+sm.getPrice());
            }
        }else{
            System.out.println("No mobile found in the given price Range.");
        }
        
    }

    public static ArrayList<smartPhone> findByBrandName(ArrayList<smartPhone> al,String brandName){

        //   return (ArrayList<smartPhone>) al.stream()
        //         .filter(h-> h.getBrandName().equals(brandName))
        //         .collect(Collectors.toList());
                
       ArrayList<smartPhone>ans=new ArrayList<>();

       for(smartPhone sm:al){
        if(sm.getBrandName().equalsIgnoreCase(brandName)){
            ans.add(sm);
        }
       }

        return ans.isEmpty() ? null : ans;
    }

    // public static ArrayList<smartPhone> findSmartPhoneByPriceRange(ArrayList<smartPhone>al,int start,int end){
    //     ArrayList<smartPhone>ans=new ArrayList<>();
    //     double max=0;int prodId=0;
    //     for(smartPhone sm:al){
    //         if(sm.getPrice()>=start && sm.getPrice()<=end){
    //             if(sm.getPrice()>max){
    //                 max=sm.getPrice();
    //                 prodId=sm.getProductId();
    //             }
    //         }
    //     }
    //     for(smartPhone sm: al){
    //         if(prodId==sm.getProductId()){
    //             ans.add(sm);
    //         }
    //     }
    //     return ans.isEmpty() ? null : ans;
    // }
       public static List<smartPhone> findSmartPhoneByPriceRange(List<smartPhone> al, int start, int end) {
        return al.stream()
                 .filter(sp -> sp.getPrice() >= start && sp.getPrice() <= end) // Filter by price range
                 .max(Comparator.comparingDouble(smartPhone::getPrice)) // Find max price
                 .map(Collections::singletonList) // Convert to list
                 .orElse(null); // Return null if no results
    }
}
class smartPhone{
    private int productId;
    private String brandName;
    private String ROM;
    private double price;

     public smartPhone(int productId,String brandName,String ROM,double price){
        this.productId=productId;
        this.brandName=brandName;
        this.ROM=ROM;
        this.price=price;
     }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getROM() {
        return ROM;
    }

    public void setROM(String rOM) {
        ROM = rOM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}