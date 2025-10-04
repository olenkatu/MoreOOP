package model;

import model.Character;

public interface KickStrategy {
    public void kick(Character c, Character target);
}