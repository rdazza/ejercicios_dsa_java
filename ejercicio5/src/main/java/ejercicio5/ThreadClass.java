package ejercicio5;

/**
 * Created by ruben on 30/09/15.
 */

import java.util.Random;

public class ThreadClass extends Thread {
    long lastExecution = 0;
    int counter = 0;

    public ThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            long currentExecution = System.currentTimeMillis();
            long elapsed = (lastExecution == 0) ? 0 : currentExecution - lastExecution;
            lastExecution = currentExecution;
            System.out.println(getName() + " elapsed time = " + elapsed + " ms. [" + (++counter) + "]");
            long sleep = (long) (Math.random() * 2000);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}