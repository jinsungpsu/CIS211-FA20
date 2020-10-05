public class QueueTestDriver {
    public static void main(String[] args) {

        Queue<String> q = new ArrayQueue<>();

        q.enqueue("hello");
        // content of queue is "hello" (where left is "front" of queue)
        System.out.println(q);

        q.enqueue("world");
        // content of queue is "hello", "world" (where left is "front" of queue)
        System.out.println(q);

        q.enqueue("tacos");
        // content of queue is "hello", "world", "tacos" (where left is "front" of queue)
        System.out.println(q);

        q.dequeue();
        // content of queue is "world", "tacos" (where left is "front" of queue)
        System.out.println(q);

        q.dequeue();
        // content of queue is "tacos" (where left is "front" of queue)
        System.out.println(q);

    }
}
