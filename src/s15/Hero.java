package s15;

//5.3
public class Hero {
    protected String name;
    protected int age;
    protected int power;

    Hero(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    void lostPower(double power) {
        this.power -= power;
    }


}
