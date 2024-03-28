import java.util.ArrayList;
import java.util.HashMap;

public class PrintMeMyHashMap {

    // Method to print keys of the HashMap
    public static void printKeys(HashMap<String, String> hashMap){
        // Iterate over the keys and print each key
        for(String items : hashMap.keySet()){
            System.out.println(items);
        }
    }

    // Method to print keys containing a specific text
    public static void printKeysWhere(HashMap<String, String> hashMap, String text){
        // Iterate over the keys and print those containing the specified text
        for(String items : hashMap.keySet()){
            if(items.contains(text)){
                System.out.println(items);
            }
        }
    }

    // Method to print values corresponding to keys containing a specific text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text){
        // ArrayList to store values corresponding to keys containing the specified text
        ArrayList<String> hashValues = new ArrayList<>();

        // Iterate over the keys and add corresponding values to the ArrayList
        for(String items : hashMap.keySet()){
            if(items.contains(text)){
                String value = hashMap.get(items);
                hashValues.add(value);
            }
        }

        // Print the values stored in the ArrayList
        for(String values : hashValues){
            System.out.println(values);
        }
    }

    public static void main(String[] args) {
        // Create a HashMap and populate it with key-value pairs
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        // Test the methods by calling them and printing results
        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
