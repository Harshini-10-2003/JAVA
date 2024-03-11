package DoublyLinkedList;

public class DoublyLinkedList {
    static Node head;
    static Node tail;

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    private static void insert(char c) {
        Node newNode = new Node(c);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

    }

    public static void printNode() {
        if (head == null) {
            System.out.println("empty");
            return;
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }
    }

    static boolean isPalindrome() {
        if (head == null) {
            return false;
        }
        Node start = head;
        Node end = tail;
        while (start != null && end != null) {
            if (start.data != end.data) {
                return false;
            }
            start = start.next;
            end = end.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "radar";
        for (char c : s.toCharArray()) {
            insert(c);
        }
        printNode();
        System.out.println(isPalindrome());
    }

}
