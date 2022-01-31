import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Z1 {

    public static <T extends Comparable<?>> T[] removeRepeatedElements(T[] tab) {
        List<T> ret = Arrays.stream(tab).collect(Collectors.toList());

        for (int i = 0; i < tab.length; i++) {
            if (!(ret.contains(tab[i]))) {
                ret.add(tab[i]);
            }
        }

        Object[] n = ret.toArray();
        T[] x = (T[]) n;
        return x;
    }

    public static void main(String[] args) {
        Character[] tab = new Character[4];
        tab[0] = 'a';
        tab[1] = 'b';
        tab[2] = 'b';
        tab[3] = 'c';

        tab = removeRepeatedElements(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }


    }
}

