import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final Semaphore semaphore=new Semaphore(2);


public static void main(String[] args) {
    System.out.println(0.1*2==0.2);
    System.out.println(0.1*3==0.3);
int a=Integer.MAX_VALUE;
    System.out.println(a);
Thread thread=new Thread(() ->{
    int id=0;
    try {
        semaphore.acquire();
        System.out.println("Thread girdi:"+Thread.currentThread().getName()+id);

        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    finally {
        id++;
        System.out.println("Thread cixdi:"+Thread.currentThread().getName()+id);
        semaphore.release();
    }
}
        );
    ExecutorService executorService= Executors.newFixedThreadPool(7);
executorService.submit(thread);
executorService.submit(thread);
    executorService.submit(thread);

}}