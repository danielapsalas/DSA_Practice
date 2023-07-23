package datastructures.StacksandQueues.LeetCode.StackLeetCode.SortStack;

import datastructures.StacksandQueues.Stacks.Stack;

public class Main {

//    Stack: Sort Stack ( ** Interview Question)
//    The sortStack method takes a single argument, a Stack object.  The method should sort the elements in the stack in
//    ascending order (the lowest value will be at the top of the stack) using only one additional stack.  The function
//    should use the pop, push, peek, and isEmpty methods of the Stack object.


//    public static void sortStack(Stack<Integer> stack) {
//        // Create a new, empty stack to hold the sorted elements
//        Stack<Integer> sortedStack = new Stack<>();
//
//        // While the original stack is not empty
//        while (!stack.isEmpty()) {
//            // Remove the top element from the original stack
//            int currentElement = stack.pop();
//
//            // Move elements from sortedStack back to the original stack until the current element is in the correct position
//            while (!sortedStack.isEmpty() && sortedStack.peek() > currentElement) {
//                stack.push(sortedStack.pop());
//            }
//
//            // Add the current element to the sorted stack
//            sortedStack.push(currentElement);
//        }
//
//        // Copy the sorted elements from sortedStack back to the original stack in the correct order
//        while (!sortedStack.isEmpty()) {
//            stack.push(sortedStack.pop());
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);
//        stack.push(2);
//        stack.push(5);
//        stack.push(1);
//        stack.push(4);
//
//        System.out.println("Before sorting:");
//        stack.printStack();
//
//        sortStack(stack);
//
//        System.out.println("\nAfter sorting:");
//        stack.printStack();
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Before sorting:
//            4
//            1
//            5
//            2
//            3
//
//            After sorting:
//            1
//            2
//            3
//            4
//            5
//
//        */
//
//    }

}
