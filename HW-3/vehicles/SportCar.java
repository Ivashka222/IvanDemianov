package vehicles;

import details.Engine;
import professions.Driver;

public class SportCar extends Car{
    double speed;

    public SportCar(String brand, String type, double speed,  int weight, Driver driver, Engine engine) {
        super(brand, type, weight, driver, engine);
        this.speed = speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
    @Override
    public String printInfo()
    {
        return "SportCar: " + "speed = " + speed + " " + super.printInfo();
    }
}
