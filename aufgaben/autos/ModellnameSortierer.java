package aufgaben.autos;

import java.util.Comparator;

public class ModellnameSortierer implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Auto)o1).modell.compareTo(((Auto)o2).modell);
    }
    
}
