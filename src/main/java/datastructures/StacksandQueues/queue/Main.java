package datastructures.StacksandQueues.queue;

public class Main {
    public static void main(String[] args) {
//        //constructor
//        Queue myQueue = new Queue(7);
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();

//        //Enqueue
//        Queue myQueue = new Queue(1);
//        myQueue.enqueue(2);
//        myQueue.printQueue();

        //Dequeque
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);
        //2 items- returns 2 nodes
        System.out.println(myQueue.dequeue().value);
        //1 item- returns 1 node
        System.out.println(myQueue.dequeue().value);
        //0 items- returns 0 nodes
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();

    }
}
