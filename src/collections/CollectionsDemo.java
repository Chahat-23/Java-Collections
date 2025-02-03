package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<String>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection.size());
        collection.remove("a");
        //collection.clear() - clears all elements
        //colection.isEmpty() - checks the above
        for(var item: collection) {
            System.out.println(item);
        }
    }
}
