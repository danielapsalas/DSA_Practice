package datastructures.StacksandQueues.queue;
public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    public void getLast(){
        System.out.println("Last: " + last.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }



//    Queue: Enqueue
//    Implement the enqueue method for the Queue class, which adds a new node to the end of the queue.
//    Return type: void
//Accept an integer value as an argument, which will be the value of the new node.
    public void enqueue(int value){

        //Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

        //If the length of the queue is 0, set both the first and last pointers of the queue to newNode.
        if(length == 0){
            first = newNode;
            last = newNode;
        }else{
            //If the length of the queue is greater than 0, perform the following tasks: a. Set the next attribute of the current last node to newNode. b. Update the last pointer of the queue to point to newNode.
            last.next = newNode;
            last = newNode;
        }

        //Increment the length attribute of the queue by 1.
        length++;
    }


//    Queue: Dequeue
//    Implement the dequeue method for the Queue class, which removes and returns the first node from the queue.
//    Return type: Node (the node that has been dequeued)
    public Node dequeue(){
        //If the length of the queue is 0, return null.
        if(length == 0){
            return null;
        }

        //Create a temporary Node variable called temp and set it to the current first node.
        Node temp = first;

        //If the length of the queue is 1, set both the first and last pointers of the queue to null.
        if(length == 1){
            first = null;
            last = null;
        }

        //If the length of the queue is greater than 1, perform the following tasks: a. Update the first pointer of the queue to point to the next node. b. Set the next attribute of the temp node to null.
        if(length > 1){
            first = temp.next;
            temp.next = null;
        }

        //Decrement the length attribute of the queue by 1.
        length--;

        //Return the temp node.
        return temp;
    }
}
