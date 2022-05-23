package s15;

//5.3
class Orc extends Hero {
    private double speed;

    Orc(String name, int power, int age) {
        super(name, power, age);
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

}


