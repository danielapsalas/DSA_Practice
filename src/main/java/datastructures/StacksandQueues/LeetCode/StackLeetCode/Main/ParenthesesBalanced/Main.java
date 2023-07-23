package datastructures.StacksandQueues.LeetCode.StackLeetCode.Main.ParenthesesBalanced;

import datastructures.StacksandQueues.Stacks.Stack;

public class Main {
//    Stack: Parentheses Balanced ( ** Interview Question)
//    Check to see if a string of parentheses is balanced or not.
//
//    By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order. For example, the string "((()))" has three pairs of balanced parentheses, so it is a balanced string. On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.  Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
//
//
//    Your program should take a string of parentheses as input and return true if it is balanced, or false if it is not.  In order to solve this problem, use a Stack data structure.
//
//    Method name: isBalancedParentheses
//
//    Return type: boolean

//    public static boolean isBalancedParentheses(String input) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : input.toCharArray()) {
//            if (ch == '(') {
//                // If an open parenthesis is encountered, push it onto the stack.
//                stack.push(ch);
//            } else if (ch == ')') {
//                // If a closing parenthesis is encountered, check if the stack is empty.
//                // If it's empty, it means there is no corresponding open parenthesis, so the parentheses are not balanced.
//                if (stack.isEmpty()) {
//                    return false;
//                }
//
//                // If the stack is not empty, pop the top element from the stack.
//                stack.pop();
//            }
//        }
//
//        // After iterating through the string, if the stack is empty, it means all open parentheses were balanced.
//        // Otherwise, there are unmatched open parentheses, so the string is not balanced.
//        return stack.isEmpty();
//    }
//
//
//
//    public static void main(String[] args) {
//        String s1 = "()()()";
//        String s2 = "()(()";
//        String s3 = "(()())";
//        System.out.println(isBalancedParentheses(s1)); // true
//        System.out.println(isBalancedParentheses(s2)); // false
//        System.out.println(isBalancedParentheses(s3)); // true
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            true
//            false
//            true
//        */
//    }
}
