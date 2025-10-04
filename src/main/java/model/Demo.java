package model;

import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String args[]) throws NoSuchMethodException, InstantiationException,
            IllegalAccessException, InvocationTargetException {
        System.out.println("Hello!");

        Character randomCharacter = CharacterFactory.createRandomCharacterWithReflection();
        System.out.println(randomCharacter);

        for (int i = 0; i < 10; i++) {
            System.out.println(CharacterFactory.createRandomCharacterWithLibReflections());
        }
    }
}