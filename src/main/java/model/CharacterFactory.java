package model;

import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class CharacterFactory {
    public static final Random RANDOM = new Random();

    private static final List<Class<?>> classes = List.of(
            Hobbit.class,
            Elf.class,
            Knight.class,
            King.class);

    public static Character createRandomCharacter() {
        int choice = RANDOM.nextInt(3);
        switch (choice) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new Knight();
            case 3:
                return new King();
        }
        return null;
    }

    public static Character createRandomCharacterWithReflection()
            throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        int choice = RANDOM.nextInt(classes.size());
        Class<?> characterClass = classes.get(choice);
        return (Character) characterClass.getDeclaredConstructor().newInstance();

    }

    public static Character createRandomCharacterWithLibReflections()
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Reflections reflections = new Reflections("model");
        Set<Class<?>> subTypes = reflections.get(Scanners.SubTypes.of(Character.class).asClass());

        subTypes.removeIf(c -> c.getSimpleName().equals("Noble")
                || java.lang.reflect.Modifier.isAbstract(c.getModifiers()));

        int choice = RANDOM.nextInt(subTypes.size());
        Class<?> characterClass = (Class<?>) subTypes.toArray()[choice];

        return (Character) characterClass.getDeclaredConstructor().newInstance();
    }

}