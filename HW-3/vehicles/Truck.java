package vehicles;

import details.Engine;
import professions.Driver;

public class Truck extends Car{
    String carrying;
    public Truck(String brand, String type, int weight, Driver driver, Engine engine, String carrying) {
        super(brand, type, weight, driver, engine);
        this.carrying = carrying;
    }

    public void setCarrying(String carrying) {
        this.carrying = carrying;
    }

    public String getCarrying() {
        return carrying;
    }
    @Override
    public String printInfo()
    {
        return "Truck: " + "carrying = " + carrying + " " + super.printInfo();
    }
}
