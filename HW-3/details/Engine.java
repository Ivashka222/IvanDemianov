package details;

public class Engine {
    double power;
    String company;
    public Engine(double power, String company)
    {
        this.power = power;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }


    public String printInfo()
    {
        return "power = " + power + ", company = " + company;
    }
}
