public class DLLQueue<T> implements Queue<T> {
    private Node head;
    private Node tail;

    @Override
    public void enqueue(T item) {
        if (head == null) {
            // first node ever, empty queue
            /*
            Node node = new Node();
            node.data = item;
            node.prev = null;
            node.next = null;

            You should really use an overloaded constructor
             */
            Node node = new Node(null, item, null);
            head = node;
            tail = node;
        }
        // handle all the other cases...
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T getFront() {
        return null;
    }

    @Override
    public T getBack() {
        return null;
    }

    private class Node {
        Node next;
        T data;
        Node prev;

        Node(Node prev, T data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}
