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


//  Get
//  Implement a method called get that retrieves a node from the linked list by its index.
//  Return type: Node
//
//  Accept an integer index as an argument, which will be the index of the node to be retrieved.
    public Node get(int index){
//      If the index is less than 0 or greater than or equal to the length of the linked list, return null.
        if(index < 0 || index >= length){
            return null;
        }

//      Create a temporary Node object called temp and set it to the current head node.
        Node temp = head;

//      Iterate through the linked list by updating temp to its next node until the desired index is reached.
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

//      Return the node located at the specified index.
        return temp;

    }


//    Set
//    Implement a method called set that updates the value of a node in the linked list by its index.
//
//    Return type: boolean
//    Accept an integer index as an argument, representing the index of the node to be updated.
//    Accept an integer value as an argument, representing the new value to set for the node at the specified index.
    public boolean set(int index, int value){
//      Call the get method with the provided index to obtain a pointer to the node at the specified index.
        Node temp = get(index);

//      If the node exists (i.e., the get method returns a non-null value), update the node's value with the provided value and return true.
        if(temp != null){
            temp.value = value;
            return true;
        }

//      If the node does not exist (i.e., the get method returns null), return false.
        return false;
    }



//    Insert
//    Implement a method called insert that inserts a new node at a specified index in the linked list.
//    Return type: boolean

//    Accept an integer index as an argument, representing the index at which the new node should be inserted.
//    Accept an integer value as an argument, representing the value of the new node.
    public boolean insert(int index, int value){

//        If the index is less than 0 or greater than the length of the list, return false.
        if(index < 0 || index >= length){
            return false;
        }

//        If the index is 0, call the prepend method with the provided value and return true.
        if(index == 0){
            prepend(value);
            return true;
        }

//        If the index is equal to the length of the list, call the append method with the provided value and return true.
        if(index == length){
            append(value);
            return true;
        }
//
//        Create a new Node object called newNode with the provided value.
        Node newNode = new Node(value);

//        Call the get method with the index minus 1 to obtain the node before the specified index.
        Node temp = get(index - 1);

//        Update the next attribute of the newNode to point to the next attribute of the node before the specified index.
        newNode.next = temp.next;

//        Update the next attribute of the node before the specified index to point to the newNode.
        temp.next = newNode;

//        Increment the length attribute of the list by 1.
        length++;
        return true;

    }



    //    Remove
    //    Implement a method called remove that removes a node at a specified index in the linked list.
    //
    //    Return type: Node (the node that has been removed)
    //  Accept an integer index as an argument, representing the index of the node to be removed.
    public Node remove(int index){
        //If the index is less than 0 or greater than or equal to the length of the list, return null.
        if(index < 0 || index >= length){
            return null;
        }

        //If the index is 0, call the removeFirst method and return its result.
        if(index == 0){
            return removeFirst();
        }

        //If the index is equal to the length of the list minus 1, call the removeLast method and return its result.
        if(index == length - 1){
            return removeLast();
        }

        //Call the get method with the index minus 1 to obtain the node before the specified index.
        Node prev = get(index - 1);

        //Create a temporary Node object called temp and set it to the next attribute of the node before the specified index.
        Node temp = prev.next;

        //Update the next attribute of the node before the specified index to point to the next attribute of the temporary Node object.
        prev.next = temp.next;

        //Set the next attribute of the temporary Node object to null.
        temp.next = null;

        //Decrement the length attribute of the list by 1.
        length--;

        return temp;
    }

//Reverse

// 	Implement a method called reverse that reverses the order of the nodes in the linked list.
// When solving the reverse() method, students are not allowed to create a new list or use any additional data structures besides the linked list itself.
// They must reverse the nodes in the existing linked list by manipulating the pointers between them.

    // Return type: void
    public void reverse(){
        // Create a temporary Node object called temp and set it to the head attribute of the list.
        Node temp = head;

        // Set the head attribute of the list to the current tail attribute.
        head = tail;

        // Set the tail attribute of the list to the temporary Node object.
        tail = temp;

        //Create a Node object called after and set it to the next attribute of the temporary Node object.
        Node after = temp.next;

        // Create a Node object called before and initialize it to null.
        Node before = null;

        // Loop through the linked list using a for loop with a counter variable i, starting from 0 and ending at the length attribute of the list.
        for(int i = 0; i < length; i++){
            //a. Set the after attribute to the next attribute of the temporary Node object.
            after = temp.next;

            //b. Set the next attribute of the temporary Node object to the before attribute.
            temp.next = before;

            //c. Set the before attribute to the temporary Node object.
            before = temp;

            //d. Set the temporary Node object to the after attribute.
            temp = after;
        }

        // The method has no return value.
    }
}


