public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Its strarts with us", "Colleen Hoover", 249.50);
        Book book2 = new Book("The Great Gatsby", " F. Scott Fitzgerald", 199.00);

        System.out.println("=== Book 1 ===");
        book1.displayDetails();

        System.out.println("\n=== Book 2 ===");
        book2.displayDetails();
    }
}
