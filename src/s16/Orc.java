package s16;


//4.1
public class Orc extends Race {
    private double speed;
    private final String nameRace = "Orc";

    Orc(int power, String raceName) {
        super(power, raceName);
        this.speed = 0;
    }

    //90% еды полезны для силы орка
    void eat(double food) {
        this.power += food * 0.9;
    }

    //Бежать с определенной скоротью
    void run(double speed) {
        this.speed = speed;
    }

    //Остановиться
    void stop() {
        this.speed = 0;
    }

    void heroSay() {
        System.out.println("раса героя - " + this.nameRace);
    }
}
