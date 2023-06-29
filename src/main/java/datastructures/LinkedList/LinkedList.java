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
}
