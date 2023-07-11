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
        if(length == 0){
            head = newNode;
//        Set both the head and tail pointers of the list to the newNode.
            tail = newNode;

//          If the length of the doubly linked list is greater than 0:
        }else{
//          Set the next attribute of the current tail node to the newNode.
            tail.next = newNode;

//          Set the prev attribute of the newNode to the current tail node.
            newNode.prev = tail;

//          Update the tail pointer of the list to point to the newNode.
            tail = newNode;
        }

//      Increment the length attribute of the list by 1.
        length++;
    }


//    Remove Last
//    Implement the removeLast method that removes the last node from the doubly linked list and returns it.
//
//    Return type: Node (the node that is being removed)
    public Node removeLast(){
        // If the length of the doubly linked list is 0, return null.
        if(length == 0){
            return null;
        }

        // Create a temporary Node called temp and set it to the current tail node.
        Node temp = tail;

        // If the length of the doubly linked list is 1:
        if(length == 1){
            // Set both the head and tail pointers of the list to null.
            head = null;
            tail = null;
        }

        //If the length of the doubly linked list is greater than 1:
        if(length > 1){
            //Set the tail pointer of the list to the previous node of the current tail node.
            tail = tail.prev;

            //Set the next attribute of the new tail node to null.
            tail.next = null;

            //Set the prev attribute of the temp node to null.
            temp.prev = null;
        }

        length--;
        return temp;
    }
}
