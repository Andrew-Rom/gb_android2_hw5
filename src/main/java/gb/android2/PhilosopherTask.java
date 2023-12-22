package gb.android2;

import java.util.Arrays;
import java.util.Random;

public class PhilosopherTask {
    static int philosophersQuantity = 5;
    static String[] philosophersNames = new String[philosophersQuantity];
    Meal meal = new Meal();

    public PhilosopherTask() {
        for (int i = 0; i < philosophersQuantity; i++) {
            Thread thread = new Thread(new Philosopher(meal));
            thread.setName(getName());
            thread.start();
        }
    }

    private static String getName() {
        String name = Names.values()[new Random().nextInt(Names.values().length)].toString();
        while (Arrays.asList(PhilosopherTask.philosophersNames).contains(name)) {
            int nameIndex = new Random().nextInt(Names.values().length);
            name = Names.values()[nameIndex].toString();
        }
        return name;
    }

}

