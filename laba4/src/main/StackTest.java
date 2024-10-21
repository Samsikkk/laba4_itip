package main;

import exception.CustomEmptyStackException;
import handler.ExceptionHandler;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        try {
            CustomStack customStack = new CustomStack();
            customStack.pop();
        } catch (CustomEmptyStackException e) {
            ExceptionHandler.logException(e);
        }
    }

    static class CustomStack {
        private Stack<Integer> stack = new Stack<>();

        public Integer pop() throws CustomEmptyStackException {
            if (stack.isEmpty()) {
                throw new CustomEmptyStackException("Стек пуст.");
            }
            return stack.pop();
        }

    }
}
