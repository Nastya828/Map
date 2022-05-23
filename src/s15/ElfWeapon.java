package s15;

//5.3
public class ElfWeapon extends Weapon {

    protected int amountArrows;

    ElfWeapon(String name, int powerStreak, int amountArrows) {
        super(name, powerStreak);
        this.amountArrows = amountArrows;
    }

    void breakArrow(String goal) {
        if (goal == "tree") {
            this.amountArrows -= 1;
        }
    }

    void addArrows(int amountArrows) {
        this.amountArrows += amountArrows;
    }

    void hit(int amountHits) {
        amountArrows -= amountHits;
    }

    @Override
    public String toString() {
        return "ElfWeapon{" +
                "amountArrows=" + amountArrows +
                ", name='" + name + '\'' +
                ", powerStreak=" + powerStreak +
                '}';
    }
}
