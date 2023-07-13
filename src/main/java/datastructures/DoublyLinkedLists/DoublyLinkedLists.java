package datastructures.DoublyLinkedLists;

public class DoublyLinkedLists {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedLists(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
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
    public void append(int value) {
//      Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

//        If the length of the doubly linked list is 0:
        if (length == 0) {
            head = newNode;
//        Set both the head and tail pointers of the list to the newNode.
            tail = newNode;

//          If the length of the doubly linked list is greater than 0:
        } else {
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
    public Node removeLast() {
        // If the length of the doubly linked list is 0, return null.
        if (length == 0) {
            return null;
        }

        // Create a temporary Node called temp and set it to the current tail node.
        Node temp = tail;

        // If the length of the doubly linked list is 1:
        if (length == 1) {
            // Set both the head and tail pointers of the list to null.
            head = null;
            tail = null;
        }

        //If the length of the doubly linked list is greater than 1:
        if (length > 1) {
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
    public void prepend(int value) {
        //Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

        //If the length of the doubly linked list is 0:
        if (length == 0) {
            //Set both the head and tail pointers of the list to the newNode.
            head = newNode;
            tail = newNode;

            //If the length of the doubly linked list is greater than 0:
        } else {
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
    public Node removeFirst() {
        //If the length of the doubly linked list is 0, return null.
        if (length == 0) {
            return null;
        }

        //Store the current head node in a temporary variable called temp.
        Node temp = head;

        //If the length of the doubly linked list is 1:
        if (length == 1) {
            //Set both the head and tail pointers of the list to null.
            head = null;
            tail = null;

            //If the length of the doubly linked list is greater than 1:
        } else {
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
    public Node get(int index) {
        //If the index is less than 0 or greater than or equal to the length of the doubly linked list, return null.
        if (index < 0 || index >= length) {
            return null;
        }

        //Initialize a temp variable to store the node to be retrieved.
        Node temp = head;

        //If the index is less than half of the list's length:
        if (index < length / 2) {
            //Iterate from the head node to the target index by updating temp to temp.next in each iteration.
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            //If the index is greater than or equal to half of the list's length:
        } else {
            //Set temp to the tail node.
            temp = tail;

            //Iterate from the tail node to the target index by updating temp to temp.prev in each iteration.
            for (int i = length - 1; i > index; i--) {
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
    public boolean set(int index, int value) {
        //Use the get method to retrieve the node at the given index and store it in a temp variable.
        Node temp = get(index);

        //If the temp node is not null, perform the following tasks:
        if (temp != null) {
            //Update the value of the temp node to the given value.
            temp.value = value;

            //Return true to indicate that the operation was successful.
            return true;
        }

        //If the temp node is null, return false to indicate that the operation was unsuccessful.
        return false;
    }


    // Insert
    // Implement the insert method that inserts a new node with a given value at a specified index in the doubly linked list.

    // Return type: boolean
    public boolean insert(int index, int value) {
        //Check if the given index is within the valid range. If the index is less than 0 or greater than the list's length, return false.
        if (index < 0 || index > length) {
            return false;
        }

        //If the index is 0, call the prepend method with the given value, and return true.
        if (index == 0) {
            prepend(value);
            return true;
        }

        //If the index is equal to the list's length, call the append method with the given value, and return true.
        if (index == length) {
            append(value);
            return true;
        }

        //Create a new Node object called newNode with the given value.
        Node newNode = new Node(value);

        //Use the get method to retrieve the node before the given index and store it in a variable called before.
        Node before = get(index).prev;

        //Set the after variable to the next attribute of the before node.
        Node after = before.next;

        //Set the after variable to the next attribute of the before node.
        newNode.prev = before;

        //Set the prev attribute of the newNode to the before node and the next attribute to the after node.
        newNode.next = after;

        //Update the next attribute of the before node to point to the newNode.
        before.next = newNode;

        //Update the prev attribute of the after node to point to the newNode.
        after.prev = newNode;

        //Increment the length of the list.
        length++;

        //Return true to indicate that the operation was successful.
        return true;
    }


    //remove
//    Implement the remove method that removes a node at a specified index from the doubly linked list.
//
//    Return type: Node
    public Node remove(int index) {
        //Check if the given index is within the valid range. If the index is less than 0 or greater than or equal to the list's length, return null.
        if (index < 0 || index >= length) {
            return null;
        }

        //If the index is 0, call the removeFirst method and return its result.
        if (index == 0) {
            return removeFirst();
        }

        //If the index is equal to the list's length minus 1, call the removeLast method and return its result.
        if (index == length - 1) {
            return removeLast();
        }

        //Use the get method to retrieve the node at the given index and store it in a variable called temp.
        Node temp = get(index);

        //Update the prev attribute of the next node of the temp node to point to the prev node of the temp node.
        temp.next.prev = temp.prev;

        //Update the next attribute of the prev node of the temp node to point to the next node of the temp node.
        temp.prev.next = temp.next;

        //Set the next and prev attributes of the temp node to null.
        temp.next = null;
        temp.prev = null;

        //Decrement the length of the list.
        length--;

        //Return the removed node (the temp node).
        return temp;
    }


//    LEETCODE PROBLEMS


    //    DLL: Swap First and Last ( ** Interview Question)
//    Swap First and Last Node Values in a Doubly Linked List.
//    Given a doubly linked list, write a method called swapFirstLast() that swaps the values of the first and last nodes in the list.
//    If the length of the list is less than 2, the method should not perform any operation.
//    Function Signature:
//    public void swapFirstLast()
//    Input:
//    The method is part of the DoublyLinkedList class, which has a head and a tail pointer, as well as a length attribute.
//    Output:
//    No explicit output is returned. However, the method should modify the doubly linked list such that the values of the first and last nodes are swapped.
//    Constraints:
//    The doubly linked list may be empty, have only one node, or have two or more nodes.
    public void swapFirstLast() {
        if (length < 2) {
            return;
        } else {
            Node temp = head;
            head = tail;
            tail = temp;
        }
    }


    //    DLL: Reverse ( ** Interview Question)
//    Implement a method called reverse() that reverses the order of the nodes in the list.
//    Method Signature:
//    public void reverse()
//    Output:
//    No explicit output is returned. However, the method should modify the doubly linked list such that the order of the nodes is reversed.
//    Constraints:
//    The doubly linked list may be empty or have one or more nodes.
//    Example:
//    Consider the following doubly linked list:
//    Head: 1
//    Tail: 5
//    Length: 5
//    Doubly Linked List:
//    1 <-> 2 <-> 3 <-> 4 <-> 5
//    After calling reverse(), the list should be:
//    Head: 5
//    Tail: 1
//    Length: 5
//    Doubly Linked List:
//    5 <-> 4 <-> 3 <-> 2 <-> 1
    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }


//    DLL: Palindrome Checker ( ** Interview Question)
//    Write a method to determine whether a given doubly linked list reads the same forwards and backwards.
//    For example, if the list contains the values [1, 2, 3, 2, 1], then the method should return true, since the list is a palindrome.
//    If the list contains the values [1, 2, 3, 4, 5], then the method should return false, since the list is not a palindrome.
//    Method name: isPalindrome
//    Return Type: boolean
    public boolean isPalindrome(){
        // Initialize and move pointers
        Node headPointer = head;
        Node tailPointer = tail;

        while (headPointer != null && tailPointer != null && headPointer != tailPointer) {
            // Compare values
            if (headPointer.value != tailPointer.value) {
                return false;
            }

            // Move pointers
            headPointer = headPointer.next;
            tailPointer = tailPointer.prev;
        }

        return true;

}


}
