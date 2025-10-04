package model;

public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public Character(int power, int hp, KickStrategy kickStrategy) {
        this.power = power;
        this.hp = hp;
        this.kickStrategy = kickStrategy;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public KickStrategy getKickStrategy() {
        return kickStrategy;
    }

    public void setKickStrategy(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public void setHp(int HP) {
        if (HP < 0) {
            HP = 0;
        }
        this.hp = HP;
    }

    public void kick(Character target) {
        kickStrategy.kick(this, target);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return String.format("%s{hp=%d, power=%d}", this.getClass().getSimpleName(), getHp(), getPower());
    }
}