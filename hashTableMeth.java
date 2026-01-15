import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;

public class HashtableDemo {

    public static void main(String[] args) {

        // Default constructor
        Hashtable<Integer, String> table1 = new Hashtable<>();
        table1.put(1, "Ramesh");
        table1.put(2, "Suresh");
        table1.put(3, "Mahesh");

        System.out.println("Hashtable table1: " + table1);

        // Constructor with initial capacity
        Hashtable<Integer, String> table2 = new Hashtable<>(5);
        table2.put(10, "Anita");
        table2.put(11, "Pooja");

        System.out.println("Hashtable table2: " + table2);

        // Constructor with initial capacity and load factor
        Hashtable<Integer, String> table3 = new Hashtable<>(10, 0.75f);
        table3.put(20, "Karan");

        System.out.println("Hashtable table3: " + table3);

        // Constructor using Map
        Hashtable<Integer, String> table4 = new Hashtable<>(table1);
        System.out.println("Hashtable table4 (copied): " + table4);

        // putIfAbsent()
        table1.putIfAbsent(4, "Rohit");

        // get()
        System.out.println("Value for key 2: " + table1.get(2));

        // containsKey()
        System.out.println("Contains key 3? " + table1.containsKey(3));

        // containsValue()
        System.out.println("Contains value Mahesh? " + table1.containsValue("Mahesh"));

        // replace()
        table1.replace(3, "Mukesh");
        System.out.println("After replace(): " + table1);

        // remove()
        table1.remove(1);
        System.out.println("After remove(): " + table1);

        // size()
        System.out.println("Size: " + table1.size());

        // isEmpty()
        System.out.println("Is empty? " + table1.isEmpty());

        // keySet()
        System.out.println("Keys: " + table1.keySet());

        // values()
        System.out.println("Values: " + table1.values());

        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : table1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Enumeration using keys()
        System.out.println("Using keys() Enumeration:");
        Enumeration<Integer> keyEnum = table1.keys();
        while (keyEnum.hasMoreElements()) {
            System.out.println(keyEnum.nextElement());
        }

        // Enumeration using elements()
        System.out.println("Using elements() Enumeration:");
        Enumeration<String> valueEnum = table1.elements();
        while (valueEnum.hasMoreElements()) {
            System.out.println(valueEnum.nextElement());
        }

        table1.forEach((k, v) ->
                System.out.println("Key: " + k + ", Value: " + v)
        );

        table4.clear();
        System.out.println("Hashtable table4 after clear(): " + table4);
    }
}
