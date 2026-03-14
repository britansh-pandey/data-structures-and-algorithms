public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void insert(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void display() {

        if(head == null) {
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while(temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}
