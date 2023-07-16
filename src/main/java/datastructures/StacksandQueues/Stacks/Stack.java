package datastructures.StacksandQueues.Stacks;

public class Stack {
    //A private Node attribute called top that points to the top node of the stack.
    private Node top;
    //A private int attribute called height that keeps track of the number of elements in the stack.
    private int height;

    class Node{ //A Node class that represents the nodes of the stack:
        //An int attribute called value that stores the value of the node.
        int value;
        //A Node attribute called next that points to the next node in the stack.
        Node next;

        //A constructor that accepts an integer value as an argument and initializes the value attribute with the given value.
        Node(int value){
            this.value = value;
        }

    }

    public Stack(int value){ //A constructor for the Stack class that performs the following tasks:
        //Creates a new Node object called newNode with the given value.
        Node newNode = new Node(value);
        //Initializes the top attribute with the newNode.
        top = newNode;
        //Sets the height attribute to 1.
        height = 1;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }



//    Stack: Push
//    Implement a push method that adds a new node with a given value to the top of the stack.
//
//    Return type: void
    public void push(int value){ //Accept an integer value as an argument, which will be the value of the new node.

        Node newNode = new Node(value); //Create a new Node object called newNode with the given value.

        //If the height of the stack is 0, set the top attribute to the newNode.
        if(height == 0){
            top = newNode;
        }

        //If the height of the stack is greater than 0, perform the following tasks:
        if(height > 0){
            newNode.next = top;//Set the next attribute of the newNode to the current top node.
            top = newNode;//Update the top attribute to point to the newNode.
        }

        height++;//Increment the height attribute of the stack by 1.
    }

//    Stack: Pop
//    Implement a pop method that removes and returns the top node from the stack.
//
//    Return type: Node (the node that was popped from the stack)
    public Node pop(){
        if (height == 0){//If the height of the stack is 0, return null.
            return null;
        }
        //Store the current top node in a temporary variable called temp.
        Node temp = top;
        //Update the top attribute to point to the next node in the stack.
        top = temp.next;

        //Set the next attribute of the temp node to null to disconnect it from the stack.
        temp.next = null;
        //Decrement the height attribute of the stack by 1.
        height--;
        //Return the temp node.
        return temp;
    }
}
