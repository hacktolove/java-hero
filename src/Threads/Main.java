package Threads;

class Product {

}

public class Main {

    public static void main(String[] args) {

        Runnable product =  () -> {
            System.out.println("Getting product");
        };

        Runnable delivery = () -> {
            System.out.println("Delivering product");
            System.out.println("Product delivered");
        };

        Thread thread1 = new Thread(product);
        Thread thread2 = new Thread(delivery);

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);


        ThreadGroup group = new ThreadGroup("Group");

        thread1.setName("Product");
        thread2.setName("Delivery");

        group.enumerate(new Thread[]{thread1 , thread2});


    }

}
