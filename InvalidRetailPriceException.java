public class InvalidRetailPriceException extends Exception {
    public InvalidRetailPriceException(String message){
        super(message);
    }
    public InvalidRetailPriceException(double price){
        super("This price is invalid: " + price);
    }
}
