import java.util.LinkedList;
import java.util.Queue;

class Antrian{
    Queue<String> queue = null;

    public Antrian(){
        this.queue = new LinkedList<>();
    }

    public void enqueue(String nama){
        this.queue.add(nama);
    }

    public String dequeue(){
        return this.queue.poll();
    }

    public String lihatAntrianBerikut(){
        return this.queue.peek();
    }

    public void printIsiAntrian(){
        System.out.println("Queue: " + this.queue);
    }
}

public class ContohQueue {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();

        antrian.enqueue("Siti");
        antrian.enqueue("Susi");
        antrian.enqueue("Aisyah");

        antrian.printIsiAntrian();

        String servedPerson = antrian.dequeue();
        System.out.println("Served: " + servedPerson);
        
        System.out.println("Queue after serving");
        antrian.printIsiAntrian();

        String namaBerikutnya = antrian.lihatAntrianBerikut();
        System.out.println("Next in line: " + namaBerikutnya);
    }
}