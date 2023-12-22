package gb.android2;

public class Philosopher extends Thread {

    static int maxEatingTimes = 3;
    private int eatingCounter;

    Meal meal;

    public Philosopher(Meal meal) {
        this.eatingCounter = 0;
        this.meal = meal;
    }

    @Override
    public void run() {
        while (this.eatingCounter < Philosopher.maxEatingTimes) {
            meal.eat();
            this.eatingCounter++;
        }
    }
}
