public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed");
        } else {
            System.out.println(title + " is already borrowed");
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Diary of a Wimpy Kid: Dog Days", "Jeff Kinney", 220.00);
        book.getDetails();
        book.borrowBook();
        book.getDetails();
        book.borrowBook();
    }
}