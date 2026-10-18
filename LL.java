class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL {
    Node head = null;

    public void addLast(int data) {
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

    public void removeIndex(int x) {
        while (head != null && head.data == x) {
            head = head.next;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == x) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.printList();
        list.removeIndex(4);
        list.printList();
    }
}