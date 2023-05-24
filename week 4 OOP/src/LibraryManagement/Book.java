package LibraryManagement;

public class Book {
    private final String title;
    private final String authorName;
    private final int bookId;
    private final int bookVersion;
    private boolean available;

    public Book(String title, String authorName, int bookId, int bookVersion) {
        this.title = title;
        this.authorName = authorName;
        this.bookId = bookId;
        this.bookVersion = bookVersion;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public int getBookVersion() {
        return bookVersion;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkOut() throws Exception {
        if (!available) {
            throw new Exception("LibraryManaegment.Book not available");
        }
        available = false;
    }

    public void checkIn() {
        available = true;
    }
}