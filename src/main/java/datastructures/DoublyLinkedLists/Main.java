package datastructures.DoublyLinkedLists;

public class Main {

    public static void main(String[] args) {
//        //constructor
//        DoublyLinkedLists myDLL = new DoublyLinkedLists(7);
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.printList();


//        //append
//        DoublyLinkedLists myDLL = new DoublyLinkedLists(1);
//        myDLL.append(2);
//        myDLL.printList();


        //remove last
//        DoublyLinkedLists myDLL = new DoublyLinkedLists(1);
//        myDLL.append(2);
//        //making sure it works
//        //2 items - returns 2 Node
//        System.out.println(myDLL.removeLast().value);
//
//        //1 items - returns 1 Node
//        System.out.println(myDLL.removeLast().value);
//
//        //0 items - returns 0 Node
//        System.out.println(myDLL.removeLast());

        //prepend
        DoublyLinkedLists myDLL = new DoublyLinkedLists(2);
        myDLL.append(3);
        myDLL.prepend(1);
        myDLL.printList();
    }

}
