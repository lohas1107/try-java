import java.util.Comparator;

public class MyComparator implements Comparator<Sorting> {

    @Override
    public int compare(Sorting o1, Sorting o2) {
        return o1.value - o2.value;
    }

}
