package Ejercicio6;

/**
 * Created by ruben on 30/09/15.
 */
public class AppSynchronization {
    public static void main(String[] args) {
        String line = "Hola, soy nuevo y no me ubico mucho en esto de Java.\n";
        Buffer buffer = new Buffer();
        Thread producer = new Thread(new Producer(buffer, line), "producer");
        Thread consumer = new Thread(new Consumer(buffer), "consumer");

        consumer.start();
        producer.start();
    }
}