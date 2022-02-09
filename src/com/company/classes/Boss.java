package com.company.classes;

public class Boss {
    private int health;
    private int damage;
    private String protectType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public void printInfo(){
        System.out.println("Boss info: \n\t\tHealth\t\t\t: "
                + this.health + "\n\t\tDamage\t\t\t: "
                + this.damage + "\n\t\tProtection Type\t: "
                + this.protectType);
    }
}
