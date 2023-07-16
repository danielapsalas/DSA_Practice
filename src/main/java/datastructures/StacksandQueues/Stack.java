package datastructures.StacksandQueues;

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
}
