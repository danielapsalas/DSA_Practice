package datastructures.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value); //the new keyword runs the constructor and creates a node, by setting this equal we are pointing newNode to the Node we just created
        head = newNode; //this lets head point to the newNode
        tail = newNode;
        length = 1;//one item so the length will be one
    }

    //how to create a new linked list -
    //LinkedList myLinkedlist = new LinkedList(4)

    //will print out the linked list
    public void printList() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.value); //goes trhough each linked list node until the value is null
            temp = temp.next;
        }
    }

    //TO DO - working on append
    //Create a new node
    //The last item in the linked list needs to point to it
    //Tail needs to point to it
    //If the linked list is empty
    //have head and tail point to the new node
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    //TO DO - working on remove last
    //Code for there's multiple items, when its null,
    // and when there's only one item
    public Node removeLast() {
        if (length == 0) { //if its null or empty
           return null;
        }

        Node pre = head;
        Node temp = head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }


    //TO DO - Pre-pend
    //Create a Node
    //We need the new node to point to the same node head points to(the same Node head points to)
    //Head needs to point to the new node
    //code for when its null, head and tail will point to the new node
    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //TO DO - removing first Node
    //move head to next node
    //remove the first node
    //code for if theres only one node
    //code for if theres no node
    public Node removeFirst() {
        if (length == 0) { //if its null or empty
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    //TO DO - get method
    //get a node at a particular index
    public Node get(int index){
        if(index < 0 || index >= length){ //making sure the index is in range
            return null; //that index wasnt found
        }

        Node temp = head; //need to make a variable we can return

        for(int i = 0; i < index; i++){ //looking for the index with temp
            temp = temp.next;//we'll move the temp forward(looking through the indexes
        }

        return temp;//returning the index we were looking for
    }



    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
