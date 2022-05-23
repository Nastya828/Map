package s15;

//5.3
class Elf extends Hero {
    private String homelandName = "Middle Earth";
    private int amountArrows;
    Elf(String name, int power, int age) {
        super(name, power, age);
        this.amountArrows = 1500;
    }

    // сколько выстрелов сделано, столько же стрел потрачено
    void shoot(int amountArrows) {
        this.amountArrows -= amountArrows;
    }

    //Эльф восстанавливает магическую силу, когда поет
    void recoveryMagic(int amountSongs) {
        this.power *= amountSongs;
    }
}

