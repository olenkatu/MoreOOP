package model;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character enemy) {
        System.out.println(("Cry a lot!"));
    }
}