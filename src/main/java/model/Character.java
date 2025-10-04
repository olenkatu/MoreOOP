package model;

abstract class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract void kick(Character c);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    protected void decreaseHp(int value) {
        hp = Math.max(0, hp - value);
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

}