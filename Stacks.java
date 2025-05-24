import java.util.EmptyStackException;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Stacks {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        System.out.println("Top element is: " + stack.peek()); // Output: 30

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // Output: 30
        stack.display();

        // Pop remaining elements
        stack.pop();
        stack.pop();

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}
