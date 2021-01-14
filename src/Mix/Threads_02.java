package First;

public class Threads_02 {

    public static void main(String[] args) {

        System.out.println("Main thread starts Working :) ");

        ThreadRunner A = new ThreadRunner("A");
        ThreadRunner B = new ThreadRunner("B");
        ThreadRunner C = new ThreadRunner("C");

        System.out.println("Is Thread A is alive : " + A.th.isAlive());
        System.out.println("Is Thread B is alive : " + B.th.isAlive());
        System.out.println("Is Thread C is alive : " + C.th.isAlive());

        try {
            System.out.println("Waiting for Thread to Terminate ... ");
            A.th.join();
            B.th.join();
            C.th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" ... Threads Terminated");
        System.out.println("Is Thread A is alive : " + A.th.isAlive());
        System.out.println("Is Thread B is alive : " + B.th.isAlive());
        System.out.println("Is Thread C is alive : " + C.th.isAlive());

        System.out.println("Main Thread : exiting :( ");
    }

    public static class ThreadRunner implements Runnable {

        Thread th;

        public ThreadRunner(String threadName) {
            th = new Thread(this, threadName);
            System.out.println("Thread Runner Starts Working for Thread : " + th);
            th.start();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                fun();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(th.getName() + " : exiting :( ");
        }

        public void fun() throws InterruptedException {
            for (int i = 5; i > 0; i--) {
                System.out.println(th.getName() + " : " + i);
                Thread.sleep(1000);
            }
        }

    }

}
