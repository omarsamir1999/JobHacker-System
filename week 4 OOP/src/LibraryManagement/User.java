package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private final int userId;
    private final List<Book> borrowedBooks;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) throws Exception {
        if (!book.isAvailable()) {
            throw new Exception("Book not available");
        }
        book.checkOut();
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) throws Exception {
        if (!borrowedBooks.contains(book)) {
            throw new Exception("Book not borrowed by user");
        }
        book.checkIn();
        borrowedBooks.remove(book);
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}