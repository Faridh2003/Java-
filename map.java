import java.util.HashMap;
import java.util.Map;

public class map{
    static void main(String[] args) {
        // Create a Map with String keys and Integer values
        Map<String, Integer> ages = new HashMap<>();

        // 1. Add elements using put()
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // 2. Access a value using get()
        int bobsAge = ages.get("Bob");
        System.out.println("Bob's age: " + bobsAge); // Output: Bob's age: 25

        // 3. Update an element using put() with an existing key
        ages.put("Alice", 31); // Overwrites the old value
        System.out.println("Updated Alice's age: " + ages.get("Alice"));

        // 4. Remove an element using remove()
        ages.remove("Charlie");
        System.out.println("Map after removing Charlie: " + ages);

        // 5. Iterate through the map using entrySet()
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
//        System.out.println(ages);
    }
}
