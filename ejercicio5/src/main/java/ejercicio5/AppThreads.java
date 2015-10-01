package ejercicio5;

public class AppThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass threadClass = new ThreadClass("ThreadClass");
        Thread thread = new Thread(new RunnableClass(), "RunnableClass");
        threadClass.start();
        thread.start();

        threadClass.join();
        thread.join();

        System.out.println("Se acabó.");
    }
}