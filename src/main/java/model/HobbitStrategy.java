package model;

public class HobbitStrategy implements KickStrategy {
    @Override
    public void kick(Character c, Character target) {
        System.out.println("Hobbit cries:(");

    }
}