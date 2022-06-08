import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        // write your code here
        linkedList.pollFirst()addAll(arrayList);
        int size = arrayList.size();
        arrayList.clear();
        for (int i = 0; i < size; i++) {
            arrayList.add(linkedList.removeFirst());
        }
    }
}