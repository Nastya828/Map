package s12;
//5.1 && 5.2
class Elf {
    private String name;
    private String homelandName;
    private int age;
    private int amountArrows;
    private int magicPower;

    Elf(String name, String homelandName, int age) {
        this.name = name;
        this.homelandName = homelandName;
        this.age = age;
        this.amountArrows = 1500;
        this.magicPower = 5000;
    }
    void shoot(int amountArrows) {
        this.amountArrows -= amountArrows;
    }
    void magicStrike(int magicPower) {
        this.magicPower -= magicPower;
    }
    void recoveryMagic(int amountSongs) {
        this.magicPower *= amountSongs;
    }
}
