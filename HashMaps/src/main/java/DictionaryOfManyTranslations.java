package DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    // HashMap to store word translations
    private HashMap<String, ArrayList<String>> wordTranslations;

    // Constructor to initialize the hashmap
    public DictionaryOfManyTranslations() {
        wordTranslations = new HashMap<>();
    }

    // Method to add a translation for a word
    public void addTranslation(String word, String translation) {
        // If the word doesn't exist in the hashmap, add it with an empty ArrayList
        wordTranslations.putIfAbsent(word, new ArrayList<>());
        // Add the translation to the ArrayList of translations for the word
        wordTranslations.get(word).add(translation);
    }

    // Method to get translations for a word
    public ArrayList<String> translate(String word) {
        // Get translations for the specified word, or an empty ArrayList if the word doesn't exist
        ArrayList<String> translations = wordTranslations.getOrDefault(word, new ArrayList<>());
        // Return a copy of the ArrayList to prevent external modifications
        return new ArrayList<>(translations);
    }

    // Method to remove a word and its translations from the dictionary
    public void removeWord(String word) {
        //Try to remove the word
        try {
            // Remove the word from the hashmap
            wordTranslations.remove(word);
        }
        //Catch if error is thrown
        catch (NullPointerException e) {
            System.out.println("Error - Word not found in the dictionary.");
        }
    }


    // Main method for testing the DictionaryOfManyTranslations class
    public static void main(String[] args) {
        // Create an instance of DictionaryOfManyTranslations
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();

        // Add translations for some words
        dictionary.addTranslation("lie", "maata");
        dictionary.addTranslation("lie", "valehdella");
        dictionary.addTranslation("bow", "jousi");
        dictionary.addTranslation("bow", "kumartaa");

        // Print translations for the word "lie"
        System.out.println(dictionary.translate("lie"));

        // Remove the word "bow" and its translations from the dictionary
        dictionary.removeWord("bow");

        // Print translations for the word "bow" after removal
        System.out.println(dictionary.translate("bow"));
    }
}
