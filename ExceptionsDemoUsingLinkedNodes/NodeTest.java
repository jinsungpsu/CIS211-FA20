public class NodeTest {
    public static void main(String[] args) {
        /*
        Node<Integer> node2 = new Node<>(2, null);
        Node<Integer> node1 = new Node<>(1, node2);

        Node<Integer> node3 = new Node<>(3, null);
        node2.setNext(node3);

         */

        LinkedNodes<Integer> list = new LinkedNodes<>();
        list.add(56465);
        list.add(2235);
        list.add(324676);

        try {
            System.out.println(list.get(-5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Hey, you're trying to access an item in this linked node thing... that doesn't exist");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list);


    }
}
