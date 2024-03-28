import java.util.HashMap;

public class Program {

    // Method to print the values (books) stored in the hashmap
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book items : hashmap.values()) {
            System.out.println(items);
        }
    }

    // Method to print the values (books) whose names contain a specific text
    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        for (Book items : hashMap.values()) {
            if (items.getName().contains(text)) {
                System.out.println(items);
            }
        }
    }

    public static void main(String[] args) {
        // Create a hashmap to store books
        HashMap<String, Book> hashmap = new HashMap<>();

        // Add books to the hashmap
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        // Print all books in the hashmap
        printValues(hashmap);
        System.out.println("---");

        // Print books whose names contain "prejud"
        printValueIfNameContains(hashmap, "prejud");
    }
}
