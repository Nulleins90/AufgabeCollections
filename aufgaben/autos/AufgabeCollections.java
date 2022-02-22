package aufgaben.autos;
import java.util.*;

public class AufgabeCollections {
    public static void main(String[] args) {
        VW vw1 = new VW("Golf", 1990);
        VW vw2 = new VW("Polo", 2001);
        VW vw3 = new VW("Passat", 2020);
        BMW bmw1 = new BMW("Z4", 2000);
        BMW bmw2 = new BMW("Modell", 2002);

        // System.err.println(vw1);
        // System.out.println(bmw);

        LinkedList linkList = new LinkedList();
        HashSet hSet = new HashSet();
        TreeSet tSet = new TreeSet();

        linkList.add(vw1);
        linkList.add(vw2);
        linkList.add(vw3);

        hSet.add(vw1);
        hSet.add(vw2);
        hSet.add(vw3);

        tSet.add(vw1);
        tSet.add(vw2);
        tSet.add(vw3);

        for (Object object : tSet) {
            System.out.println(object);
        }
        System.err.println("------------------------------------");

        for (Object object : hSet) {
            System.out.println(object);            
        }

        System.err.println("------------------------------------");

        for (Object object : linkList) {
            System.out.println(object);            
        }
    }
}
