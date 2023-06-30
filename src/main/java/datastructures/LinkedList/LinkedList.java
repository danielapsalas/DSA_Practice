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
