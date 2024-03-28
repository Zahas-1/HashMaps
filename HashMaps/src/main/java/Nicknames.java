import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        // Create a new HashMap to store nickname mappings
        HashMap<String, String> hashMap = new HashMap<>();

        // Add nickname mappings to the HashMap
        hashMap.put("matt", "matthew");
        hashMap.put("mix", "michael");
        hashMap.put("artie", "arthur");

        // Print the full name associated with the "matt" nickname
        System.out.println(hashMap.get("matt"));
    }
}
