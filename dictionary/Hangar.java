public class Hangar implements Comparable<Hangar> {
    private int id;
    private String color;
    private int capacity;
    private String name;

    @Override
    public int compareTo(Hangar hangar) {
        if (this.id < hangar.id) {
            return -1;
        } else if (this.id > hangar.id) {
            return 1;
        }
        return 0;
    }
}
