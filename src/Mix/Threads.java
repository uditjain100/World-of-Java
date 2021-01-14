package First;

public class Threads {

    public static void main(String[] args) {
        fun();
        Thread th = new Thread(new A());
        th.start();

        B b = new B();
        b.start();
    }

    public static class A implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fun();
        }
    }

    public static void fun() {
        System.out.println("Fun function called");
    }

    public static class B extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fun();
        }
    }

}
