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


    //Prepend
    //Implement the prepend method that adds a new node to the beginning of the doubly linked list.

    //Return type: void

    //Accept an integer value as an argument, which will be the value of the new node.
    public void prepend(int value){
        //Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

        //If the length of the doubly linked list is 0:
        if(length == 0){
            //Set both the head and tail pointers of the list to the newNode.
            head = newNode;
            tail = newNode;

            //If the length of the doubly linked list is greater than 0:
        }else{
            //Set the next attribute of the newNode to the current head node.
            newNode.next = head;

            //Set the prev attribute of the current head node to the newNode.
            head.prev = newNode;

            //Update the head pointer of the list to point to the newNode.
            head = newNode;
        }
        //Increment the length attribute of the list by 1.
        length++;
    }



// Remove First
// Implement the removeFirst method that removes the first node from the doubly linked list and returns it.

    // Return type: Node (the node being removed)
    public Node removeFirst(){
        //If the length of the doubly linked list is 0, return null.
        if(length == 0){
            return null;
        }

        //Store the current head node in a temporary variable called temp.
        Node temp = head;

        //If the length of the doubly linked list is 1:
        if(length == 1){
            //Set both the head and tail pointers of the list to null.
            head = null;
            tail = null;

            //If the length of the doubly linked list is greater than 1:
        } else{
            //Update the head pointer of the list to point to the next node in the list.
            head = head.next;

            //Set the prev attribute of the new head node to null.
            head.prev = null;

            //Set the next attribute of the temp node to null.
            temp.next = null;
        }

        //Decrement the length attribute of the list by 1.
        length--;

        //Return the temp node.
        return temp;
    }


//    Get
//    Implement the get method that retrieves a node at a given index from the doubly linked list.
//
//    Return type: Node
    public Node get(int index){
        //If the index is less than 0 or greater than or equal to the length of the doubly linked list, return null.
        if(index < 0 || index >= length){
            return null;
        }

        //Initialize a temp variable to store the node to be retrieved.
        Node temp = head;

        //If the index is less than half of the list's length:
        if(index < length/2){
            //Iterate from the head node to the target index by updating temp to temp.next in each iteration.
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        //If the index is greater than or equal to half of the list's length:
        }else{
            //Set temp to the tail node.
            temp = tail;

            //Iterate from the tail node to the target index by updating temp to temp.prev in each iteration.
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        //Return the temp node.
        return temp;
    }

//    set
//    Implement the set method that updates the value of a node at a given index in the doubly linked list.
//
//    Return type: boolean
    public boolean set(int index, int value){
        //Use the get method to retrieve the node at the given index and store it in a temp variable.
        Node temp = get(index);

        //If the temp node is not null, perform the following tasks:
        if(temp != null){
            //Update the value of the temp node to the given value.
            temp.value = value;

            //Return true to indicate that the operation was successful.
            return true;
        }

        //If the temp node is null, return false to indicate that the operation was unsuccessful.
        return false;
    }
}
