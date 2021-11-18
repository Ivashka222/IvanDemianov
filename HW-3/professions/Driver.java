package professions;
import person.Person;
public class Driver extends Person{
    int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Integer getExperience() {
        return experience;
    }

    @Override
    public String printInfo()
    {
        return "experience = " + experience + " " + super.printInfo();
    }
}
