package Coding.Training;

public class List implements LinkedList {
    private Node head;
    private Node current;
    private int length;

    public List() {
        head = current = new Node(null, null);
        length = 0;
    }

    // Return the item at index i
    public Object get(int i) {
        current = head.next;
        int j = 0;

        while (current != null && j < i) {
            current = current.next;
            j++;
        }

        return current.value;
    }

    // Add an item
    public void add(Object item) {
        Node newNode = new Node(item, null);
        current = head.next;

        // Get the last node
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = null;
        length++;
    }

    // Remove the item at index i
    public void remove(int i) {
        Node prve = head;
        current = head.next;
        int j = 0;

        while (current != null && j < i) {
            prve = current;
            current = current.next;
            j++;
        }
        prve.next = current.next;
        length--;
    }

    // Insert an item t index i
    public void insert(Object item, int i) {
        Node newNode = new Node(item, null);
        Node prve = head;
        current = head.next;
        int j = 0;

        while (current != null && j < i) {
            prve = current;
            current = current.next;
            j++;
        }
        newNode.next = current;
        prve.next = newNode;
        length++;
    }

    // Return the length of this list
    public int length() {
        System.out.println(length);
        return length;
    }

    // Print the list
    public void print() {
        if (length == 0) {
            System.out.println("There is no elements in the list.");
        } else {
            for (Node current = head.next; current != null; current = current.next) {
                System.out.print(current.value + " ");
            }
        }

    }
}
