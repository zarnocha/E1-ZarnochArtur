import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Z1 {

    public static <T extends Comparable<?>> ArrayList<T> removeRepeatedElements(T[] tab) {
        ArrayList<T> new_tab = new ArrayList<>();

        for (int i = 0; i < tab.length; i++) {
            if (!(new_tab.contains(tab[i]))) {
                new_tab.add(tab[i]);
            }
        }
        return new_tab;
    }

    public static void main(String[] args) {
        Character[] tab = new Character[5];
        tab[0] = 'a';
        tab[1] = 'b';
        tab[2] = 'b';
        tab[3] = 'c';
        tab[4] = 'c';

        ArrayList tab_new = removeRepeatedElements(tab);
        tab_new.forEach(x -> System.out.print(x + ", "));

        LocalTime[] tab2 = new LocalTime[5];
        tab2[0] = LocalTime.parse("10:15");
        tab2[1] = LocalTime.parse("10:15");
        tab2[2] = LocalTime.parse("20:10");
        tab2[3] = LocalTime.parse("20:10");
        tab2[4] = LocalTime.parse("04:07");

        ArrayList tab_new2 = removeRepeatedElements(tab2);
        System.out.println("");
        tab_new2.forEach(x -> System.out.print(x + ", "));

    }
}

