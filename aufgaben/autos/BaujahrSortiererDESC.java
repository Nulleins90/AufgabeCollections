package aufgaben.autos;

import java.util.Comparator;

public class BaujahrSortiererDESC implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(((Auto)o1).baujahr < ((Auto)o2).baujahr){
            return 1;
        }
        else if(((Auto)o1).baujahr > ((Auto)o2).baujahr) {
            return -1;
        }
        return 0;
    }
    
}
