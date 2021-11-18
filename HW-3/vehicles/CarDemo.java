package vehicles;
import details.Engine;
import professions.Driver;

public class CarDemo {
    public static void main(String[] args)
    {
        Driver driver = new Driver("Ivan", 25, 6);
        Engine engine = new Engine(300 , "Tesla");

        Car car = new Car("Tesla", "B", 1400, driver, engine);

        SportCar sportCar = new SportCar("Mclaren","C", 345.5, 1250, driver, engine);
        Truck truck = new Truck("Ford", "D", 6200, driver, engine, "4000 tons");

        System.out.println(car.printInfo());
        System.out.println(sportCar.printInfo());
        System.out.println(truck.printInfo());
    }
}
