public class ArrayQueue<T> implements Queue<T> {
    final static int DEFAULT_CAPACITY = 50;
    private T[] queue;

    private int front, back;
    // the front of the queue will be on the "left" of the array (meaning, it starts at index 0)

    // some kind of counter to keep track of the array index...
    // something to keep track of front and back
    // alternatively, we can calculate one from the other based on "size" (number of items currently stored)

    public ArrayQueue() {
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
        front = back = -1;
    }

    @Override
    public void enqueue(T item) {
        if (front == -1) {
            // if it's empty
            queue[0] = item;
            front = back = 0;
        } else {
            // if it's not empty
            back++;
            queue[back] = item;
        }
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T getFront() {
        return queue[front];
    }

    @Override
    public T getBack() {
        return queue[back];
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = front; i <= back; i++) {
            out.append(queue[i] + " ");
        }
        return out.toString();
    }
}
