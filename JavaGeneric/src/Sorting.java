public class Sorting implements Comparable<Sorting> {

    int value;

    public Sorting(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Sorting o) {

        return o.value - this.value;
    }

    @Override
    public String toString() {
        return "[value = " + value + "]";
    }

}
