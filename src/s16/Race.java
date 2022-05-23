package s16;


//4.1
public class Race {
    int power;
    String raceName;


    public Race(int power, String raceName) {
        this.power = power;
        this.raceName = raceName;
    }

    void lostPower(double power) {
        this.power -= power;
    }

    void heroSay() {
        System.out.println("раса героя - неизестна!");
    }
}
