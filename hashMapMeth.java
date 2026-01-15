import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Amit");
        map1.put(102, "Neha");
        map1.put(103, "Rahul");

        System.out.println("Map1: " + map1);


        HashMap<Integer, String> map2 = new HashMap<>(5);
        map2.put(201, "Ravi");
        map2.put(202, "Pooja");

        System.out.println("Map2: " + map2);

        // Constructor with capacity and load factor
        HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);
        map3.put(301, "Karan");

        System.out.println("Map3: " + map3);

        // Constructor using Map
        HashMap<Integer, String> map4 = new HashMap<>(map1);
        System.out.println("Map4 (copied from map1): " + map4);

        // putIfAbsent()
        map1.putIfAbsent(104, "Sonia");

        // get()
        System.out.println("Value for key 102: " + map1.get(102));

        // getOrDefault()
        System.out.println("Value for key 999: " + map1.getOrDefault(999, "Not Found"));

        // containsKey()
        System.out.println("Contains key 101? " + map1.containsKey(101));

        // containsValue()
        System.out.println("Contains value Rahul? " + map1.containsValue("Rahul"));

        // replace()
        map1.replace(103, "Rohit");
        System.out.println("After replace(): " + map1);

        // remove()
        map1.remove(102);
        System.out.println("After remove(): " + map1);

        // size()
        System.out.println("Size: " + map1.size());

        // isEmpty()
        System.out.println("Is empty? " + map1.isEmpty());

        // keySet()
        System.out.println("Keys: " + map1.keySet());

        // values()
        System.out.println("Values: " + map1.values());

        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // forEach()
        map1.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value)
        );

        // clear()
        map4.clear();
        System.out.println("Map4 after clear(): " + map4);
    }
}
