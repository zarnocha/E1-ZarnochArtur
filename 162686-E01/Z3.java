import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Z3 {

    public static File[] sorted(File[] tab) {
        Stream<File> str = Arrays.stream(tab).sorted((obj, obj2) -> {
            if (obj.isDirectory() && !(obj2.isDirectory())) {
                return -1;
            }
            else if (!obj.isDirectory() && obj2.isDirectory()) {
                return 1;
            }
            else if (obj.isDirectory() && obj2.isDirectory()) {
                return obj.toString().compareToIgnoreCase(obj2.toString());
            }
            else if (!(obj.isDirectory()) && !(obj2.isDirectory())) {
                return obj.getName().compareToIgnoreCase(obj2.getName());
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj lokalizacje:");
        String lokalizacja = scan.nextLine();

        File file = new File(lokalizacja);
        File[] tab_file = file.listFiles();
        tab_file = sorted(tab_file);

        for (int i = 0; i < tab_file.length; i++) {
            System.out.print(tab_file[i] + "\n");
        }
    }
}
