package s16;

//4.1
public class OrcWeapon extends Weapon {
    protected int powerHit;
    protected int strength;

    OrcWeapon(String name, int powerWeapon, int powerHit, int strength) {
        super(name, powerWeapon);
        this.powerHit = powerHit;
        this.strength = strength;
    }

    void powerLost(int powerHit) {
        this.powerHit += powerHit;
    }

    void lostStrength(int amountHits) {
        while (this.strength > 0) {
            this.strength -= amountHits + super.powerStreak;
        }
        if (this.strength < 0) {
            this.strength = 0;
        }
    }
}
