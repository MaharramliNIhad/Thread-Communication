public class Queue {
    private static final int Limit=2;
  private final java.util.Queue<Integer> queue=new java.util.LinkedList<>();
    public synchronized void producer(int value) throws InterruptedException {
while (queue.size()==Limit){
    System.out.println("producer gozleyir");
    wait();
}
queue.add(value);
        System.out.println("elave edildi"+value);
notifyAll();
    }
    public synchronized void consumer() throws InterruptedException {
        while (queue.size()==0){
            System.out.println("consumer gozleyir");
        }
      int removed=queue.remove();
        System.out.println("silindi"+removed);
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        Queue queue=new Queue();
        Thread producer = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    queue.producer(value++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    queue.consumer();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    producer.start();
    consumer.start();

    }
}
