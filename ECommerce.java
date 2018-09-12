import java.util.*;

public class ECommerce 
{
    public static void main(String args[])  {
 System.out.println("***Welcome to E Commerce***");
 System.out.println("Please enter your choice: (1) Submit (2) Add");
 Scanner s = new Scanner(System.in);
 int choice = s.nextInt();
 ProductInfo prodInfo = new ProductInfo();
 
 if(choice == 1)
 {
     prodInfo.displayInfo();
 }
 if(choice == 2)
 {
  
   Scanner sc = new Scanner(System.in);
   String prodId = sc.next();
   String prodName = sc.next();
   String price = sc.next();
   String category = sc.next();
   String quantity = sc.next();
   String purDate = sc.next();
   String expDate = sc.next();

   prodInfo.prodId = prodId;
   prodInfo.prodName = prodName;
   prodInfo.price = price;
   prodInfo.category = category;
   prodInfo.quantity = quantity;
   prodInfo.purDate = purDate;
   prodInfo.expDate = expDate;

   prodInfo.addInfo();
 }

    }
}

 class ProductInfo
{
 String prodId;
 String prodName;
 String price;
 String category;
 String quantity;
 String purDate;
 String expDate;

 ArrayList<ArrayList<String>> products = new ArrayList<ArrayList<String>>();
 ArrayList productDetails = new ArrayList(); 

public ProductInfo()
{}

 public ProductInfo(String prodId, String prodName, String price, String category, String quantity, String purDate, String expDate)
 {
  this.prodId = prodId;
  this.prodName = prodName;
  this.price = price;
  this.category = category;
  this.quantity = quantity;
  this.purDate = purDate;
  this.expDate = expDate;
 }

 public String addInfo()
 {
    productDetails.add(prodId);     
    productDetails.add(prodName);
    productDetails.add(price);
    productDetails.add(category);
    productDetails.add(quantity);
    productDetails.add(purDate);
    productDetails.add(expDate);

    products.add(productDetails);
    productDetails = new ArrayList(productDetails);
    products.add(productDetails);

    String res  = "Data successfully added!!!";
    return res;
 }

 public ArrayList displayInfo()
 {
     return (products);
 }
 

}