package Task1;

public class MyThread extends Thread {
    static int i = 0;
    static int k = 0;


    @Override
    public void run() {
        if (i < 50) {
            i++;
            k = i;
            Thread thread1 = new MyThread();
            thread1.start();
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Thread number : " + k + " created");
                k--;
            }
        }
    }


}



