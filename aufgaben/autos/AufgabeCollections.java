package aufgaben.autos;
import java.util.*;

public class AufgabeCollections {
    public static void main(String[] args) {
        VW vw1 = new VW("Golf", 1990);
        VW vw2 = new VW("Polo", 2001);
        VW vw3 = new VW("Passat", 2020);

        // System.err.println(vw1);
        // System.out.println(bmw);

        LinkedList linkList = new LinkedList();
        HashSet hSet = new HashSet();
        TreeSet tSet = new TreeSet(new BaujahrSortierer());

        linkList.add(vw1);
        linkList.add(vw2);
        linkList.add(vw3);

        hSet.add(vw1);
        hSet.add(vw2);
        hSet.add(vw3);

        tSet.add(vw1);
        tSet.add(vw2);
        tSet.add(vw3);

        // for (Object object : tSet) {
        //     System.out.println(object);
        // }
        // System.err.println("------------------------------------");

        // for (Object object : hSet) {
        //     System.out.println(object);            
        // }

        // System.err.println("------------------------------------");

        // for (Object object : linkList) {
        //     System.out.println(object);            
        // }        
        BMW bmw1 = new BMW("Z4", 2013);
        BMW bmw2 = new BMW("Modell", 2002);

        ArrayList aList = new ArrayList();
        HashSet hSet2 = new HashSet();
        TreeSet tSet2 = new TreeSet();

        aList.add(bmw2);
        aList.add(bmw1);

        hSet2.add(bmw2);
        hSet2.add(bmw2);
        hSet2.add(bmw1);

        tSet2.add(bmw2);
        tSet2.add(bmw1);

        // Iterator itList = aList.iterator();
        // while (itList.hasNext()) {
        //     System.out.println(itList.next());
        // }
        // System.out.println("-------------");

        // Iterator itHashSet = hSet2.iterator();
        // while (itHashSet.hasNext()) {
        //     System.out.println(itHashSet.next());
        // }
        // System.out.println("-------------");

        // Iterator itTreeSet = hSet2.iterator();
        // while (itTreeSet.hasNext()) {
        //     System.out.println(itTreeSet.next());
        // }

        // System.out.println(hSet2.contains(bmw1));
        bmw1.setBaujahr(2008);
        // System.out.println(hSet2.contains(bmw1));
        //Aufgabe 8 hash-Wert hat sich geändert

        VW vw4 = new VW("Polo", 2200);
        linkList.add(vw4);

        // System.out.println(Collections.binarySearch(aList, vw4));

        // System.out.println(Collections.binarySearch(linkList, vw4));

        // System.out.println(Collections.binarySearch(linkList, new VW("Polo", 3300)));

        tSet.add(vw4);
        tSet.add(bmw1);
        tSet.add(bmw2);

        System.out.println("----------");
        Iterator itSet = tSet.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        aList.add(vw1);
        aList.add(vw2);
        aList.add(vw3);

        System.out.println("-----------");
        Collections.sort(aList, new BaujahrSortiererDESC());
        Iterator itList = aList.iterator();
        while (itList.hasNext()) {
            System.out.println(itList.next());
        }

        System.out.println("--------------");

        TreeSet kopie = new TreeSet(new ModellnameSortierer());
        kopie.addAll(aList);
        Iterator itKopie = kopie.iterator();
        while (itKopie.hasNext()) {
            System.out.println(itKopie.next());
        }

    }
}
