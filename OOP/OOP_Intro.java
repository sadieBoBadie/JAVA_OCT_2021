/*
    Java Day 2 - OOP Basics Warm Up

    What does OOP stand for? What is it, briefly?
        Object Oriented Programming
        why?
        dont DRY
        organization / dynamic

                            
    What is a class?
        blueprint
        set of instructions (recipe book)

                            
    Classes in Java contain member variables and methods. Give a brief explanation for each:
    Constructor(s):
        declares defaults
    
    Member Variables: 
        something the class HAS (owns)
    Methods:	
        something the class can DO (actions)
                
    








*/				


public class ShoppingCart {
    // member variables
    public String store;
    public double total; // 0
    public ArrayList<String> items = new ArrayList<String>(); //["item"]

    public ShoppingCart() {}

    // methods
    public void add_item(String item, double price){
        this.items.add(item); // ["item"]
        this.total += price; // 0 + 11.99 = total = 11.99
}
}

