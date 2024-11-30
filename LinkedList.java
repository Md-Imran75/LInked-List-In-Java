public class LinkedList {

    Node head;
    Node node;

    // insert
    public void insert(int data) {
        node = new Node();
        node.data = data;
        node.Next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;

            while (n.Next != null) {
                n = n.Next;
            }

            n.Next = node;
        }
    }

    // insertAtFirst
    public void insertAtFirst(int data) {
        node = new Node();
        node.data = data;
        node.Next = head;
        head = node;
    }

    // insertAtIndex
    public void insertAtIndex(int data, int index) {
        node = new Node();
        node.data = data;
        Node n = head;

        if (index == 0) {
            insertAtFirst(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.Next;
            }

            node.Next = n.Next;
            n.Next = node;
        }

    }

    // removeAtBack
    public void removeAt(int index) {

        Node n = head;

        if (n != null) {

            if (index == 0) {
                head = head.Next;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    n = n.Next;
                }

                Node temp = n.Next;
                n.Next = temp.Next;
            }

        } else {
            System.err.println("List is empty");
        }

    }

    // Show the list
    public void show() {
        if (head != null) {
            Node n = head;
            while (n.Next != null) {
                System.out.println(n.data);
                n = n.Next;
            }

            System.out.println(n.data);
        } else

        {
            System.out.println("List is empty");
        }
    }

}
