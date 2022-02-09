package com.company;

import com.company.classes.Boss;
import com.company.classes.Hero;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(700);
        boss1.setDamage(50);
        boss1.setProtectType("Armor");
        boss1.printInfo();
        Hero[] hero = new Hero[createHeroes().length];
        hero = createHeroes();
        System.out.println("\nHeroes info:");
        for (Hero element: hero){
            System.out.println(element.getName()
                    + ": \tHealth\t\t\t: " + element.getHealth()
                    + "\n\t\tDamage\t\t\t: " + element.getDamage()
                    + "\n\t\tSuper Power\t\t: " + element.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(500, 30, "Thunder", "Thor");
        heroes[1] = new Hero(450, 35);
        heroes[2] = new Hero(300, 20, "Arrow", "Robin");
        return heroes;
    }
}
