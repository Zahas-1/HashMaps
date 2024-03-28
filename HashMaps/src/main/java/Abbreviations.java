import java.util.HashMap;

public class Abbreviations {
    // HashMap to store abbreviation mappings
    private HashMap<String, String> abbrev;

    // Constructor to initialize the HashMap
    public Abbreviations(){
        this.abbrev = new HashMap<>();
    }

    // Method to add an abbreviation and its explanation to the HashMap
    public void addAbbreviation(String abbreviation, String explanation){
        abbrev.put(abbreviation, explanation);
    }

    // Method to check if the HashMap contains a given abbreviation
    public boolean hasAbbreviation(String abbreviation){
        return abbrev.containsKey(abbreviation);
    }

    // Method to find the explanation for a given abbreviation
    public String findExplanationFor(String abbreviation){
        if(abbrev.containsKey(abbreviation)){
            return abbrev.get(abbreviation);
        } else {
            return null;
        }
    }

    // Main method to test the Abbreviations class
    public static void main(String[] args) {
        // Create an instance of Abbreviations class
        Abbreviations abbreviations = new Abbreviations();

        // Add some abbreviations and their explanations
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        // Sample text containing abbreviations
        String text = "e.g. i.e. etc. lol";

        // Split the text into parts using whitespace as delimiter
        for (String part: text.split(" ")) {
            // Check if the part is an abbreviation
            if(abbreviations.hasAbbreviation(part)) {
                // If it's an abbreviation, replace it with its explanation
                part = abbreviations.findExplanationFor(part);
            }

            // Print the part (either the original word or its explanation)
            System.out.print(part);
            System.out.println(" ");
        }

        System.out.println();
    }
}
