import javax.swing.JOptionPane;

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

   public CellPhone(String m, String man, double price) throws InvalidManufacturerException, InvalidModelException, InvalidRetailPriceException
   {
      try {
         setModel(m);
      } catch (InvalidModelException e) {
         JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
      }
      try {
         setManufacturer(man);
      } catch (InvalidManufacturerException e) {
         JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
      }
      try {
         setRetailPrice(price);
      } catch (InvalidRetailPriceException e) {
         JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
      }
      // setModel(m);
      // setManufacturer(man);
      // setRetailPrice(price);
   }
   public CellPhone() throws InvalidManufacturerException, InvalidModelException, InvalidRetailPriceException
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
      if(price <= 0 || price > 1500 || price == 0.0 || price == 0){
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