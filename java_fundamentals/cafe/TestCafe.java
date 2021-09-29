import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
            
        // Note: Below is a way to add multiple elements to a list in fewer lines.
        // It does require an extra import at the top of the file.
        menu.addAll(loadMenu);
        prices.addAll(loadPrices);

        // System.out.println("menu: " + menu);
        // System.out.println("prices: " + prices);

        CafeUtil appTest = new CafeUtil();
        appTest.displayMenu(menu, prices);

        // -------------
        System.out.println("----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>(); // []
        // Test 4 times
        for (int i = 0; i < 4; i++) { 
            appTest.addCustomer(customers); 
            System.out.println(customers);
        }
    }
}