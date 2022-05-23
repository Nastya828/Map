package s16;

//4.1
class Elf extends Race {
    private String homelandName = "Middle Earth";
    private int amountArrows;
    private final String nameRace = "Elf";


    Elf(int power, String raceName) {
        super(power, raceName);
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

    void heroSay() {
        System.out.println("раса героя - " + this.nameRace);
    }

}
