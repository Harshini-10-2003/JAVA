package LinkedList1;

class Linkedlist1 {
    public static Node head = null;

    public static void addAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Inserting element at first
    static void AddFirst(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            addAtFirst(arr[i]);
        }
    }


    // delete first node in linked list


    public static void deleteAtFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }


    // delete last node in linked list


    static void deleteLast() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }


    // printing Linked list


    public static void PrintNode() {
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


    // Detect cycle in linked list


    static boolean detectCycle() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


    // level order traversing


   
    static public void reverseList() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    static public void rotate() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        Node lastNode = current.next;
        current.next = null;
        lastNode.next = head;
        head = lastNode;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 5, 6 };
        AddFirst(arr);
        // deleteAtFirst();
        // deleteLast();
        reverseList();
        // rotate();
        PrintNode();

        // head.next.next.next.next.next=head;
        // System.out.println(detectCycle());

    }

}