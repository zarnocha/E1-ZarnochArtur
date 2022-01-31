import java.util.ArrayList;
import java.util.Iterator;

public class Z2 {

    static public <E extends Iterable<?>> void printMarginal(E obj) {
        Iterator iter = obj.iterator();
        if (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        Iterator iter2 = iter;
        iter2.next();

        while (!iter2.hasNext()) {
            iter2.next();
            iter.next();
        }

        System.out.println(iter.next());
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);
        printMarginal(tab);
    }

}
