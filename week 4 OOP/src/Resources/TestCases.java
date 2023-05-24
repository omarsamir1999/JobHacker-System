package Resources;

import LibraryManagement.Book;
import LibraryManagement.Library;

public class TestCases {

    // Test cases for addBook() function
    public static void main(String[] args) {
        Library library = new Library("Library", 1234);
        Book book1 = new Book("Head First Java ", " Kathy Sierra", 1, 1);
        Book book2 = new Book("", "", -1, 1);

        if (library.addBook(book1)) {
            System.out.println("The book was added successfully. The size of the list now is: " + library.getBooks().size());
        } else {
            System.out.println("Invalid data, please try again.");
        }

        if (library.addBook(book1)) {
            System.out.println("The book was added successfully. The size of the list now is: " + library.getBooks().size());
        } else {
            System.out.println("The book already exists in the library. The size of the list is still: " + library.getBooks().size());
        }

        if (library.addBook(book2)) {
            System.out.println("The book was added successfully. The size of the list now is: " + library.getBooks().size());
        } else {
            System.out.println("Invalid data, please try again. The size of the list is still: " + library.getBooks().size());
        }


        // Test cases for removeBookById() function

        if (library.removeBookById(1)) {
            System.out.println("The book was removed successfully.");
        } else {
            System.out.println("Book not found.");
        }

        if (library.removeBookById(3)) {
            System.out.println("The book was removed successfully.");
        } else {
            System.out.println("Book not found.");

        }
    }
}
