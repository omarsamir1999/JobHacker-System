package LibraryManagement;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Library", 1234);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Welcome to " + library.getName());
            System.out.println("1. Add book");
            System.out.println("2. remove book");
            System.out.println("3. Display available books");
            System.out.println("4. Display borrowed books");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Display book details");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // add a book
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter author: ");
                    String author = scanner.next();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter version: ");
                    int version = scanner.nextInt();
                    Book newBook = new Book(title, author, id, version);
                    if (library.addBook(newBook)) {
                        System.out.println("Book added successfully");
                    } else {
                        System.out.println("Error: could not add book");
                    }
                    break;
                case 2:
                    // remove a book
                    System.out.print("Enter book ID: ");
                    int removeId = scanner.nextInt();
                    if (library.removeBookById(removeId)) {
                        System.out.println("Book removed successfully");
                    } else {
                        System.out.println("Error: could not remove book");
                    }
                    break;
                case 3:
                    // display available books
                    List<Book> availableBooks = library.getAvailableBooks();
                    if (availableBooks.isEmpty()) {
                        System.out.println("No books available");
                    } else {
                        System.out.println("Available books:");
                        for (Book book : availableBooks) {
                            System.out.println(book.getTitle() + " by " + book.getAuthorName() + " (ID: " + book.getBookId() + ")");
                        }
                    }
                    break;
                case 4:
                    // display borrowed books
                    List<Book> borrowedBooks = library.getBorrowedBooks();
                    if (borrowedBooks.isEmpty()) {
                        System.out.println("No books borrowed");
                    } else {
                        System.out.println("Borrowed books:");
                        for (Book book : borrowedBooks) {
                            System.out.println(book.getTitle() + " by " + book.getAuthorName() + " (ID: " + book.getBookId() + ")");
                        }
                    }
                    break;
                case 5:
                    // check out a book
                    System.out.print("Enter user ID: ");
                    int userId = scanner.nextInt();
                    User user = new User("User " + userId, userId);
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    try {
                        Book bookToCheckOut = library.findBookById(bookId);
                        user.borrowBook(bookToCheckOut);
                        System.out.println("Book checked out successfully");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 6:
                    // return a book
                    System.out.print("Enter user ID: ");
                    userId = scanner.nextInt();
                    user = new User("User " + userId, userId);
                    System.out.print("Enter book ID: ");
                    bookId = scanner.nextInt();
                    try {
                        Book bookToReturn = library.findBookById(bookId);
                        user.returnBook(bookToReturn);
                        System.out.println("Book returned successfully");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 7:
                    // display book details
                    System.out.print("Enter book ID: ");
                    bookId = scanner.nextInt();
                    try {
                        Book book = library.findBookById(bookId);
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Author: " + book.getAuthorName());
                        System.out.println("ID: " + book.getBookId());
                        System.out.println("Version: " + book.getBookVersion());
                        System.out.println("Available: " + book.isAvailable());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println();
        }
    }
}