public interface Queue<T> {
    public void enqueue(T item);

    public T dequeue();

    public T getFront();

    public T getBack();
}
