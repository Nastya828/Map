package s15;

//5.3
public class Weapon {
    protected String name;
    protected int powerStreak;
    public Weapon(String name, int powerStreak) {
        this.name = name;
        this.powerStreak = powerStreak;
    }

    void hit(int amountHits){
        this.powerStreak -= amountHits;
    }

}
