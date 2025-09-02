class SharedResource {
    volatile boolean flag = false;

    public void writerThread() {
        System.out.println("Writer thread started...");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true; 
        System.out.println("Writer thread updated flag to true.");
    }

    public void readerThread() {
        System.out.println("Reader thread started...");
        while (!flag) {
        }
        System.out.println("Reader thread detected flag change!");
    }
}

public class Question20 {
 public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread writer = new Thread(() -> resource.writerThread());
        Thread reader = new Thread(() -> resource.readerThread());

        reader.start();
        writer.start();
    }   
}
