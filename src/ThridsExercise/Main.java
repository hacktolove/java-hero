package ThridsExercise;

public class Main {


    public static void main(String[] args){

        class PrinterTask implements Runnable {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for(int i = 1; i <= 5; i++){

                    System.out.println(name + ":Running task " + i);
                }
            }
        }
        PrinterTask task = new PrinterTask();

        Thread thread1 = new Thread(task , "Worker-1");
        Thread thread2 = new Thread(task , "Worker-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
