import java.util.*;

class Node {

    int data;
    Node next;
    Node prev;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubelyLinkedList {

    Node head;
    Node temp;
    Node tail;
    // Method to insert a new node at the beginning

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = null; // Point new node to current head
        if (head == null) {
            head = newNode;
            temp = newNode;  // Update head to be the new node
            tail = newNode;
        } else {
            temp.next = newNode;
            newNode.prev = tail;
            temp = tail = newNode;
        }
    }

    public void insertionAtBeggining(int data) {
        Node newNode = new Node(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertMiddle(int data, int pos) {
        temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Method to print the list
    public void printList() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        DoubelyLinkedList list = new DoubelyLinkedList();

        // Adding elements
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.insertionAtBeggining(40);
        list.insert(50);
        list.printList();
        int pos = a.nextInt();
        list.insertMiddle(60, pos);

        System.out.print("Double Linked List: ");
        list.printList();
    }
}
