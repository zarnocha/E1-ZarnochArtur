import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Z3 {

    public static File[] sorted(File[] tab) {
        Stream<File> str = Arrays.stream(tab).sorted((obj, obj2) -> {
            if (obj.isDirectory() && !(obj2.isDirectory())) {
                return 1;
            }
            else if (obj.isDirectory() && obj2.isDirectory() || !(obj.isDirectory()) && !(obj2.isDirectory())) {
                return obj.toString().compareTo(obj2.toString());
            }
            else return 0;
        });

        File[] new_tab = new File[tab.length];
        int i = 0;
        Iterator it = str.iterator();
        while (it.hasNext()) {
            new_tab[i] = (File) it.next();
            i++;
        }
        return new_tab;
    }

}
