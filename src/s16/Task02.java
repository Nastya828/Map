/*package s16;

import java.util.Random;

//4.2
public class Task02 {
    public static void main(String[] args) {
        Race[] arrayHero = new Race[500];
        for (int i = 0; i < arrayHero.length; i++) {
            Random rand = new Random();
            int t = rand.nextInt(1000) + 1;
            if (t <= 500) {
                arrayHero[i] = new Elf(1000, "Elf", new Weapon("Bow", 876));
            } else {
                arrayHero[i] = new Orc(99, "Orc", new OrcWeapon("Hammer",
                        990, 70, 9));
            }
        }
        for (int i = 0; i < 500; i++) { // вызов метода переопределенного для дочерних классов
            arrayHero[i].heroSay();     // у каждого класса выводится своя строка с названием расы героя
        }
    }
}
 */