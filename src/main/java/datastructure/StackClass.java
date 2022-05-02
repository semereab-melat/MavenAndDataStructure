package datastructure;

import java.util.Stack;

/***************************************************************
 Filename: 
 Created by: melat
 Created on: 02/05/2022
 Comment: 
 ***************************************************************/
public class StackClass {
    public static void main(String[] args) {
        //Last In First Out
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //peek() gives the element at the top
        System.out.println(stack.peek());

        System.out.println(stack.size());
        //pop() gives the last elements at the same time delete this element
        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.isEmpty());
    }
}
