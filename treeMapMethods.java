import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.SortedMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Default constructor
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(103, "Rahul");
        map1.put(101, "Amit");
        map1.put(102, "Neha");

        System.out.println("TreeMap map1: " + map1);

        //  Constructor with Comparator  
        TreeMap<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");

        System.out.println("TreeMap map2 (Reverse order): " + map2);

        // Constructor using Map
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(201, "Karan");
        hashMap.put(202, "Riya");

        TreeMap<Integer, String> map3 = new TreeMap<>(hashMap);
        System.out.println("TreeMap map3 (from HashMap): " + map3);

        // Constructor using SortedMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(301, "Sita");
        sortedMap.put(302, "Gita");

        TreeMap<Integer, String> map4 = new TreeMap<>(sortedMap);
        System.out.println("TreeMap map4 (from SortedMap): " + map4);

        // putIfAbsent()
        map1.putIfAbsent(104, "Rohit");

        // get()
        System.out.println("Value for key 102: " + map1.get(102));

        // containsKey()
        System.out.println("Contains key 101? " + map1.containsKey(101));

        // containsValue()
        System.out.println("Contains value Neha? " + map1.containsValue("Neha"));

        // remove()
        map1.remove(103);
        System.out.println("After remove(): " + map1);

        // size()
        System.out.println("Size: " + map1.size());

        // isEmpty()
        System.out.println("Is empty? " + map1.isEmpty());

        // firstKey()
        System.out.println("First key: " + map1.firstKey());

        // lastKey()
        System.out.println("Last key: " + map1.lastKey());

        // keySet()
        System.out.println("Keys: " + map1.keySet());

        // values()
        System.out.println("Values: " + map1.values());

        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // headMap()
        System.out.println("HeadMap (keys < 103): " + map1.headMap(103));

        // clear()
        map4.clear();
        System.out.println("TreeMap map4 after clear(): " + map4);
    }
}
