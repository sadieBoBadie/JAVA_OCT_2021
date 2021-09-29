public class Car {
    // member variables
    private String color;
    private String name;
    private static Integer numberOfCars = 0;

    // constructor
    public Car() {
        this.name = "no name";
        this.color = "blue";
        this.numberOfCars++;
    }
    
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.numberOfCars++;
    }
    // methods
    public void honk() {
        System.out.println(this.name + " HONK!!!");
    }

    public void sayHi(Car c) {
        System.out.println(this.getName() + " says hi to " + c.getName());
    }

    
    // getters and setters
    public static Integer getCarCount() {
        return numberOfCars;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String c) {
        this.color = c;
    }
}