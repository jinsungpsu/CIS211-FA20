public class LinkedNodes<T> {
    private Node head;

    // should we have a count variable here?????
    // downside is we need extra space...

    // what if we need to know the length of this ADT often??????

    public void add(T item) {
        // create a node
        // set the next etc...


        if (head == null) {
            // if the list is empty... ie it's the first node in the linked list
            // just create a node, set next to null
            Node node = new Node(item, null);
            head = node;
        } else {


        }

        // if the list is NOT empty????? what do we do??

    }

    public int length() {
        int count = 0;
        Node itr = head;
        while (itr.next != null) {
            count++;
            itr = itr.next;
        }

        return count;
    }

    class Node<T> {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }



}
