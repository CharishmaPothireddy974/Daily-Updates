public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            ChocoBoiler instance = ChocoBoiler.getInstance();
            System.out.println("Got instance: " + instance + " from " + Thread.currentThread().getName());
        };

        Thread threadA = new Thread(task, "Thread A");
        Thread threadB = new Thread(task, "Thread B");

        threadA.start();
        threadB.start();
    }
}
