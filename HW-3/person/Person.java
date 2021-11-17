package person;

public class Person {
    String fullName;
    int age;
    public Person(String fullName, int age)
    {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    public String getFullname() {
        return fullName;
    }

    public String printInfo()
    {
        return "full name = " + fullName + ", age = " + age + " ";
    }
}
