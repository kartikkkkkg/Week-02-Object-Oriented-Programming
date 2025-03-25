public class Book {
    public int isbn;
    protected String title;
    private String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    private String fileFormat;

    public EBook(int isbn, String title, String author, String fileFormat) {
        super(isbn, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Format: " + fileFormat);
    }

    public static void main(String[] args) {
        EBook ebook = new EBook(123456, "Java OOP", "KG", "PDF");
        ebook.displayEBookDetails();
    }
}