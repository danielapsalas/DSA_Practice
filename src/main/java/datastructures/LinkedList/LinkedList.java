package datastructures.LinkedList;

import java.util.HashSet;
import java.util.Set;

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
    public Node findMiddleNode() {
        Node slow = head;          // initialize slow pointer to the head
        Node fast = head;          // initialize fast pointer to the head
        Node prevSlow = null;      // to keep track of the previous slow pointer position

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // move the fast pointer two steps forward
            prevSlow = slow;       // update the previous slow pointer position
            slow = slow.next;      // move the slow pointer one step forward
        }

        return prevSlow != null ? prevSlow.next : slow;    // return the second middle node for even lists, or the first middle node for odd lists

    }



    //TO DO - Has loop
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



    //TO DO - Kth Node
    public Node findKthFromEnd(int k) {
        Node slow = head;  // initialize the slow pointer to the head of the linked list
        Node fast = head;  // initialize the fast pointer to the head of the linked list

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;  // if the fast pointer reaches the end before reaching k steps, return null
            }
            fast = fast.next;  // move the fast pointer k steps forward
        }

        while (fast != null) {
            slow = slow.next;  // move the slow pointer one step forward
            fast = fast.next;  // move the fast pointer one step forward
        }

        return slow;  // return the kth node from the end
    }



    //TO DO - Reverse Between
    public void reverseBetween(int m, int n) {
        if (m >= n || head == null) {
            return;  // no nodes to reverse or invalid indices
        }

        Node prev = null;  // pointer to track the previous node
        Node curr = head;  // pointer to traverse the list

        // move curr to the node at position m
        for (int i = 0; i < m && curr != null; i++) {
            prev = curr;  // update the previous node
            curr = curr.next;  // move to the next node
        }

        Node prevM = prev;  // node before the sublist to be reversed
        Node currM = curr;  // first node of the sublist to be reversed

        // reverse the sublist nodes between m and n
        for (int i = m; i <= n && curr != null; i++) {
            Node next = curr.next;  // temporary variable to store the next node
            curr.next = prev;  // reverse the next pointer of the current node
            prev = curr;  // update the previous node
            curr = next;  // move to the next node
        }

        // connect the reversed sublist with the rest of the list
        if (prevM != null) {
            prevM.next = prev;  // connect the previous node of sublist with the first reversed node
        } else {
            head = prev;  // update the head node if sublist starts from the beginning
        }

        currM.next = curr;  // connect the end of the sublist with the next node
    }

//    TO DO: Partition
    public void removeDuplicates() {
        // Create a set to store unique values
        Set<Integer> values = new HashSet<>();

        // Initialize the previous node as null
        Node previous = null;

        // Start at the head of the linked list
        Node current = head;

        // Iterate through the list until the end
        while (current != null) {
            // Check if the value is a duplicate
            if (values.contains(current.value)) {
                // Remove the current node from the list
                previous.next = current.next;

                // Decrement the list length by 1
                length -= 1;
            } else {
                // Add the unique value to the set
                values.add(current.value);

                // Update previous to the current node
                previous = current;
            }
            // Move to the next node in the list
            current = current.next;
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

}
