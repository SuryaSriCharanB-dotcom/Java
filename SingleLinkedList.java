class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found in the list.");
        } else {
            current.next = current.next.next;
        }
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        // Insert at beginning
        list.insertAtBeginning(5);
        list.display();

        // Delete a value
        list.deleteByValue(20);
        list.display();

        // Search
        System.out.println("Is 10 in the list? " + list.search(10)); // true
        System.out.println("Is 100 in the list? " + list.search(100)); // false
    }
}
