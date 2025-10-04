package model;

public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            System.out.println("Elf kills " + c.getClass().getSimpleName() + " instantly!");
            c.decreaseHp(c.getHp());
        } else {
            System.out.println("Elf decreases enemy's power by 1");
            c.power = Math.max(0, c.power - 1);
        }
    }
}