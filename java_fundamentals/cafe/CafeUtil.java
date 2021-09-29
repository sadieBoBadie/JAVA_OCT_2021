import java.util.ArrayList;

public class CafeUtil{

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        // System.out.println(menu);
        // System.out.println(prices);
        
        for (int i = 0; i<menu.size(); i++ ) {
            
            System.out.println(i+1 + " " + menu.get(i) + " -- $" + prices.get(i) );
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        // System.out.println(">>>>>> " + customers);
        System.out.println("what is your name?");
        String userName = System.console().readLine();
        // System.out.println("your name is = " + userName);
        customers.add(userName);
        System.out.println("you have " + (customers.size() - 1) + " ahead of you");

    }

}