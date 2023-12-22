package gb.android2;

public class PhilosopherTask {
    static int philosophersQuantity = 5;
    Meal meal = new Meal();

    public PhilosopherTask() {
        for (int i = 0; i < philosophersQuantity; i++) {
            Thread thread = new Thread(new Philosopher(meal));
            thread.setName("Philosopher-" + (i + 1));
            thread.start();
        }
    }

}

