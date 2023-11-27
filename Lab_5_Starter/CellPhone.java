
/**

 Lab 5 Starter program
 The CellPhone class holds data about a cell phone.
*/
public class CellPhone
{
   // Fields
   private String model;
   private String manufacturer;    // Manufacturer
   private double retailPrice; // Retail price

   public CellPhone(String m, String man, double price)
   {
      try {
         setModel(m);
      } catch (InvalidModelException e) {
         System.out.println("Error: " + e.getMessage());
      }
      try {
         setManufacturer(man);
      } catch (InvalidManufacturerException e) {
         System.out.println("Error: " + e.getMessage());
      }
      try {
         setRetailPrice(price);
      } catch (InvalidRetailPriceException e) {
         System.out.println("Error: " + e.getMessage());
      }
   }
   public CellPhone()
   {
      this("","",0.0);
   }

   public void setModel(String m) throws InvalidModelException{
      if(m.isEmpty()){
         throw new InvalidModelException("Empty model string");
      }
      else{
         model = m;
      }
   }
   public void setManufacturer(String man) throws InvalidManufacturerException{
      if(man.isEmpty()){
         throw new InvalidManufacturerException("Empty manufacturer string");
      }
      else{
         manufacturer = man;
      }
   }
   
   public void setRetailPrice(double price) throws InvalidRetailPriceException{
      if(price <= 0 || price > 1500){
         throw new InvalidRetailPriceException(price);
      }
      else{
         retailPrice = price;
      }
   }

   public String getModel(){return model;}
   public String getManufacturer()
   {
      return manufacturer;
   }
   public double getRetailPrice()
   {
      return retailPrice;
   }

   @Override
   public String toString(){
      return String.format("Model: %-20sManufacturer: %-20sretail price: %10.2f%n",getModel(), getManufacturer(),
              getRetailPrice());

    }
}