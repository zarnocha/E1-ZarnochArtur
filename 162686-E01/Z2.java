import java.util.*;

public class Z2 {

    static public <E extends Iterable<?>> void printMarginal(E obj) {
        Iterator iter = obj.iterator();

        if (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        Iterator iter2 = obj.iterator();
        iter2.next(); iter2.next();
        while (iter2.hasNext()) {
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
        tab.add(5);
        tab.add(6);
        printMarginal(tab);

        Collection<String> tab2 = new ArrayList<>();
        tab2.add("A");
        tab2.add("B");
        tab2.add("C");
        tab2.add("D");
        tab2.add("E");
        printMarginal(tab2);

        AbstractList<Integer> tab3 = new ArrayList<>();
        tab3.add(1);
        tab3.add(2);
        tab3.add(4);
        tab3.add(5);
        tab3.add(3);
        tab3.add(6);
        printMarginal(tab3);

        Vector<Boolean> tab4 = new Vector<>();
        tab4.add(true);
        tab4.add(false);
        tab4.add(false);
        tab4.add(true);
        printMarginal(tab4);
    }

}
