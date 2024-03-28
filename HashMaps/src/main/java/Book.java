public class Book {
    // Instance variables for the book
    private String name;
    private String content;
    private int published;

    // Constructor to initialize the book with name, publication year, and content
    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    // Getter method to retrieve the name of the book
    public String getName() {
        return this.name;
    }

    // Setter method to set the name of the book
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the publication year of the book
    public int getPublished() {
        return this.published;
    }

    // Setter method to set the publication year of the book
    public void setPublished(int published) {
        this.published = published;
    }

    // Getter method to retrieve the content of the book
    public String getContent() {
        return this.content;
    }

    // Setter method to set the content of the book
    public void setContent(String content) {
        this.content = content;
    }

    // Method to return a string representation of the book
    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }
}
