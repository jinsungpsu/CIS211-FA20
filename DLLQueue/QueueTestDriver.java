public class QueueTestDriver {
    public static void main(String[] args) {

        Queue<String> q = new DLLQueue<>();

        q.enqueue("1");
        System.out.println(q);

        q.enqueue("2");
        System.out.println(q);

        q.enqueue("3");
        System.out.println(q);

        System.out.println("dequeuing: " + q.dequeue());
        System.out.println(q);

        System.out.println("dequeuing: " + q.dequeue());
        System.out.println(q);

        q.enqueue("4");
        System.out.println(q);

        q.enqueue("5");
        System.out.println(q);

        System.out.println("dequeuing: " + q.dequeue());
        System.out.println(q);

        q.enqueue("6");
        System.out.println(q);

        System.out.println("dequeuing: " + q.dequeue());
        System.out.println(q);
    }
}
