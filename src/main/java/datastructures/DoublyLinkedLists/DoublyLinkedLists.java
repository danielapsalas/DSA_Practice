package datastructures.DoublyLinkedLists;

public class DoublyLinkedLists {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkedLists(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
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


//    Append
//    Implement the append method that appends a new node to the end of the doubly linked list.
//
//    Return type: void

//    Accept an integer value as an argument, which will be the value of the new node.
    public void append(int value){
//      Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

//        If the length of the doubly linked list is 0:
//        Set both the head and tail pointers of the list to the newNode.
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
//          If the length of the doubly linked list is greater than 0:
//          Set the next attribute of the current tail node to the newNode.
//          Set the prev attribute of the newNode to the current tail node.
//          Update the tail pointer of the list to point to the newNode.
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

//      Increment the length attribute of the list by 1.
        length++;
    }

}
