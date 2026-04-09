// Step 1: Implement the Runnable interface
class MyRunnable implements Runnable {
    // Step 2: Override the run() method
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Printing numbers 1 to 5 separated by space
            System.out.print(i + " ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        // Step 3: Create an instance of the class that implements Runnable
        MyRunnable myTask = new MyRunnable();

        // Step 4: Create a Thread object and pass the Runnable instance to its constructor
        // The Thread object is the "worker," and the Runnable is the "job."
        Thread t1 = new Thread(myTask);

        // Step 5: Start the thread
        t1.start();
    }
}
