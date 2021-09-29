public class Tester {

    public static void main(String[] args) {
        
        Car someCar = new Car();
        someCar.honk();

        Car tesla = new Car("trusty", "white");
        // tesla.honk();
        // tesla.name = "Joe";
        // System.out.println(tesla.getName());


        tesla.sayHi(someCar);
        System.out.println(Car.getCarCount());
        // Integer cars = Car.carCount();
        // System.out.println(cars);
    }
}