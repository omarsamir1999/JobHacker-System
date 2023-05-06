package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
   private final String name;
   private final int code;
   private final List<Book> books;


   // Creates a new library with the given name and code
   public Library(String name, int code) {
      this.name = name;
      this.code = code;
      this.books = new ArrayList<>();
   }

   // Adds a book to the library if it doesn't already exist
   // Returns true if the book was added successfully, false otherwise
   public boolean addBook(Book book) {
      if (books.contains(book)) {
         return false; // book already exists in library
      }
      books.add(book);
      return true;
   }

   // Removes a book from the library by its ID
   // Returns true if the book was removed successfully, false otherwise
   public boolean removeBookById(int id) {
      for (Book book : books) {
         if (book.getBookId() == id) {
            books.remove(book);
            return true;
         }
      }
      return false; // book with given ID not found in library
   }

   // Finds a book in the library by its ID
   // Throws an exception if the book is not found
   public Book findBookById(int bookId) throws Exception {
      for (Book book : books) {
         if (book.getBookId() == bookId) {
            return book;
         }
      }
      throw new Exception("LibraryManaegment.Book not found");
   }

   // Returns a list of all available books in the library
   public List<Book> getAvailableBooks() {
      List<Book> availableBooks = new ArrayList<>();
      for (Book book : books) {
         if (book.isAvailable()) {
            availableBooks.add(book);
         }
      }
      return availableBooks;
   }

   // Returns a list of all borrowed books in the library
   public List<Book> getBorrowedBooks() {
      List<Book> borrowedBooks = new ArrayList<>();
      for (Book book : books) {
         if (!book.isAvailable()) {
            borrowedBooks.add(book);
         }
      }
      return borrowedBooks;
   }
   public List<Book> getBooks() {
      return books;
   }


   // Returns the name of the library
   public String getName() {
      return name;
   }

   // Returns the code of the library
   public int getCode() {
      return code;
   }
}
