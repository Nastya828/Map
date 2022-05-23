package s12;
//5.1 && 5.2
class Orc {
    private String name;
    private int age;
    private int power;
    private double speed;
    Orc(String name, int age) {
        this.name = name;
        this.age = age;
        this.speed = 0;
        this.power = 1000;
    }
    void eat(double food) {
        this.power += food * 0.9;
    }
    void run(double speed) {
        this.speed = speed;
    }
    void stop() {
        this.speed = 0;
    }
    void runWay(double speed) {
        this.power -= (int) speed;
    }
}


