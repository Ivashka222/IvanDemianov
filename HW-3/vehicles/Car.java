package vehicles;
import professions.Driver;
import details.Engine;
public class Car {
    String brand;
    String type;
    int weight;
    Driver driver;
    Engine engine;
    public Car(String brand, String type, int weight, Driver driver, Engine engine)
    {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start()
    {
        System.out.println("Let’s drive");
    }
    public void stop()
    {
        System.out.println("Stop");
    }
    public void turnRight()
    {
        System.out.println("Turn right");
    }
    public void turnLeft()
    {
        System.out.println("Turn Left");
    }

    public String printInfo()
    {
        return "Car: " + "brand = " + brand + ", type = " + type + ", weight = " + weight + ", Driver: " + driver.printInfo() + ", Engine: " + engine.printInfo() + ".";
    }
}
