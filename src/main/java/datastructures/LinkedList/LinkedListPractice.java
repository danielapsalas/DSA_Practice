//Attempting the problems again for extra practice

package datastructures.LinkedList;

public class LinkedListPractice {
//    CONSTRUCTOR
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


//    APPEND
//    Accept an integer value as an argument, which will be the value of the new node.
    public void append(int value){
//      Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

//      If the length of the linked list is 0, set both the head and tail pointers of the list to the newNode.
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
//          If the length of the linked list is greater than 0, perform the following tasks:
//          Set the next attribute of the current tail node to the newNode.
//          Update the tail pointer of the list to point to the newNode.
            tail.next = newNode;
            tail = newNode;
        }

//      Increment the length attribute of the list by 1.
        length++;
    }


//    Remove Last
//    Implement a method called removeLast that removes the last node from the linked list.
    public Node removeLast(){
//      If the length of the linked list is 0, return null.
        if(length == 0){
            return null;
        }

//      Create two variables that can point to a Node , temp and pre, both initially pointing to the head of the linked list.
        Node temp = head;
        Node pre = head;


//      Traverse the linked list until temp.next is null, performing the following tasks during traversal:
//      Update pre to point to the current temp node.
//      Update temp to point to the next node in the linked list.
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }

//      After traversal, set the tail pointer to pre.
//      Set the next attribute of the tail node to null.
//      Decrement the length attribute of the list by 1.
        tail = pre;
        tail.next = null;
        length--;

//      If the length of the linked list becomes 0 after removing the last node, set both the head and tail pointers to null.
        if(length == 0){
            head = null;
            tail= null;
        }

//      Return the removed node (pointed to by temp).
        return temp;
    }

//    Remove First
//    Implement a method called removeFirst that removes the first node from the linked list and returns it.
    public Node removeFirst(){
//      If the length of the linked list is 0, return null.
        if(length == 0){
            return null;
        }

//      Create a temporary Node object called temp and set it to the current head node.
        Node temp = head;
//      Update the head pointer of the list to point to the next node in the list.
        head = head.next;
//      Set the next attribute of temp to null
        temp.next = null;
//      Decrement the length attribute of the list by 1.
        length--;

//      If the length of the list becomes 0 after removing the first node, set the tail pointer to null.
        if(length == 0){
            tail = null;
        }

//      Return the removed temp node.
        return temp;
    }


//    Prepend
//    Implement a method called prepend that adds a new node at the beginning of the linked list.
//    Return type: void
//
//    Accept an integer value as an argument, which will be the value of the new node.
    public void prepend(int value){
//      Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

//      If the length of the linked list is 0, set both the head and tail pointers of the list to the newNode.
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
//          If the length of the linked list is greater than 0, perform the following tasks:
//          Set the next attribute of newNode to the current head node.
//          Update the head pointer of the list to point to the newNode.
            newNode.next = head;
            head = newNode;
        }
//      Increment the length attribute of the list by 1.
        length++;
    }
}


