package datastructures.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

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



    //TO DO - set method
    //set the value of a node this is at a particular index
    //return boolean on whether it was set or not
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;

    }



    //TO DO - insert method
    public boolean insert(int index, int value){
        if(index < 0 || index >= length){ //making sure the index is in range
            return false; //that index wasnt found
        }

        if(index == 0){//adding mode the index of 0
            prepend(value);
            return true;
        }

        if(index == length){//adding node at the end
            append(value);
            return true;
        }

        Node newNode = new Node(value); //the new node we are adding
        Node temp = get(index - 1); //puts it at one before the index
        newNode.next = temp.next; //we want the new node to point to the next node
        temp.next = newNode;//now the previous node is equal to the new node
        length++;
        return true;
    }



//    TO DO - remove method
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null; // index out of range, return null
        }

        if (index == 0) {
            return removeFirst(); // remove the first node
        }

        if (index == length - 1) {
            return removeLast(); // remove the last node
        }

        // get the node before the index
        Node prev = get(index - 1);
        Node temp = prev.next; // node to be removed

        // remove the node by adjusting the previous node's next pointer
        prev.next = temp.next;

        temp.next = null; // remove the reference to the next node
        length--;

        return temp; // return the removed node
    }



    //TO DO - reverse
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp; // swapping head and tail

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next; // saving reference to the next node
            temp.next = before; // reversing the next pointer of current node
            before = temp; // updating before to current node
            temp = after; // updating temp to next node
        }
    }



    //TO DO: find middle
    //find the middle node, if its even print thr second middle node
    //should use a slow and fast pointer to find the middle element
    public boolean hasLoop() {
        Node slow = head;  // initialize the slow pointer to the head of the linked list
        Node fast = head;  // initialize the fast pointer to the head of the linked list

        while (fast != null && fast.next != null) {  // continue until the end of the linked list is reached
            fast = fast.next.next;  // move the fast pointer two steps forward
            slow = slow.next;  // move the slow pointer one step forward

            if (fast == slow) {  // if the fast and slow pointers meet, a loop is present
                return true;
            }
        }

        return false;  // no loop found in the linked list
    }




    //TO DO -


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
