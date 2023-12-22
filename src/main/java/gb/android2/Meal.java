package gb.android2;

public class Meal {
    synchronized void eat() {

        System.out.println(Thread.currentThread().getName() + " started eating.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\t" + Thread.currentThread().getName() + " finished eating.");

        notifyAll();

        try {
            System.out.println("\t\t" + Thread.currentThread().getName() + " is thinking.\n");
            wait(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

