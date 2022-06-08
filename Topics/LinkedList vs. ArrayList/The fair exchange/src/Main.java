import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void changeHeadsAndTails(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        String l_f=linkedList.getFirst();
        String a_f=arrayList.get(0);
        linkedList.set(0,a_f);
        arrayList.set(0,l_f);

        String l_l=linkedList.getLast();
        String a_l= arrayList.get(arrayList.size()-1);

        linkedList.set(linkedList.size()-1,a_l);
        arrayList.set(arrayList.size()-1,l_l);

    }
}