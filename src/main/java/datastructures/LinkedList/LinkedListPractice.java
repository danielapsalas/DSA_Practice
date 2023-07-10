//Attempting the problems again for extra practice

package datastructures.LinkedList;

public class LinkedListPractice {

//    A private Node object called head that points to the first node in the linked list.
//
//    A private Node object called tail that points to the last node in the linked list.
//
//    A private integer attribute called length that represents the number of nodes in the linked list.
    private Node head;
    private Node tail;
    private int length;


//  A nested Node class with the following attributes:
//
//  An integer attribute called value that stores the value of the node.
//
//  A Node object called next that points to the next node in the linked list.
//
//  A constructor that accepts an integer value as an argument and initializes the value attribute
    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }


//    A constructor for the LinkedList class that accepts an integer value as an argument and performs the following tasks:
//
//    Create a new Node object called newNode with the given value.
//
//    Set both the head and tail pointers of the list to the newNode.
//
//    Set the length attribute of the list to 1.
    public LinkedListPractice(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }



    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

}
