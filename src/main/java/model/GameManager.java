package model;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("\nA fight begins between " + c1.getClass().getSimpleName() + " and "
                + c2.getClass().getSimpleName() + "!");

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " attacks!");
            c1.kick(c2);
            System.out.println(c2.getClass().getSimpleName() + " HP: " + c2.getHp());

            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " has died!");
                break;
            }

            System.out.println(c2.getClass().getSimpleName() + " attacks!");
            c2.kick(c1);
            System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp());

            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " has died!");
                break;
            }
        }
    }
}