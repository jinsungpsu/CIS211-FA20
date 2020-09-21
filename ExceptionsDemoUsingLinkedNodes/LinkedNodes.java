public class LinkedNodes<T> {
    private Node top;

    // should we have a count variable here?????
    // downside is we need extra space...

    // what if we need to know the length of this ADT often??????

    public void add(T item) {
        // create a node
        // set the next etc...

        if (top == null) {
            // if the list is empty... ie it's the first node in the linked list
            // just create a node, set next to null
            Node node = new Node(item, null);
            top = node;
        } else {
            Node node = new Node(item, top);
            //head.next = node;
            top = node;
        }

        // if the list is NOT empty????? what do we do??
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node itr = top;
        while (count != index) {
            count++;
            itr = itr.next;
        }
        return (T)itr.data;
    }

    public int length() {
        int count = 0;
        Node itr = top;
        while (itr.next != null) {
            count++;
            itr = itr.next;
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(top.data.toString() + " " + top.next.data.toString() + " " +  top.next.next.data.toString());

        return output.toString();
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
