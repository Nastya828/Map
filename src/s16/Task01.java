package s16;

public class Task01 {

    //4.1
    public static void main(String[] args) {
        System.out.println("Создать героя - орка:");
        OrcWeapon weaponOrc = new OrcWeapon("Hammer", 990, 70, 9);
        Orc orc = new Orc(99, "Orc");
        Hero orcHero = new Hero("Uruk Hai", 890, orc, weaponOrc);
        System.out.println("Name = " + orcHero.name + "\nage = " + orcHero.age + "\nrace:" + orcHero.raceHero.raceName
                + "\npower = " + orcHero.raceHero.power + "\nweapon: " + orcHero.weapon.name);
        System.out.println("\nСоздать героя - эльфа:");
        ElfWeapon weaponElf = new ElfWeapon("Bow", 787, 1786);
        Elf elf = new Elf(1000, "Elf");
        Hero elfHero = new Hero("Legolas", 656, elf, weaponElf);
        System.out.println("Name = " + elfHero.name + "\nage = " + elfHero.age + "\nrace:" + elfHero.raceHero.raceName
                + "\npower = " + elfHero.raceHero.power + "\nweapon: " + elfHero.weapon.name);
        System.out.println();
    }
}
