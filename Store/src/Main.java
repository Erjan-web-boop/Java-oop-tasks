import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product electronics = new Electronics("Samsung", 15000, 250, "Gadget");
        Product clothing = new Clothing("Suit", 3500, 42, "Female");

        List<Product> products = new ArrayList<>(Arrays.asList(electronics, clothing));

        for (Product p : products) {
    	if (p instanceof Discountable) {
        	Discountable discountable = (Discountable) p;
        	discountable.applyDiscount(10);
    		}
		}

        for (Product p : products) {
            p.printDetails();
        }
    }
}