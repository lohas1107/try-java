import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sorting[] list = { new Sorting(1), new Sorting(-1), new Sorting(0) };

        Arrays.sort(list);
        System.out.println(Arrays.asList(list));

        Arrays.sort(list, new MyComparator());
        System.out.println(Arrays.asList(list));
    }

}
