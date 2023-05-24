package LibraryManagement;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
   private final String name;
   private final int code;
   private final Map<Integer, Book> books;


   // Creates a new library with the given name and code
   public Library(String name, int code) {
      this.name = name;
      this.code = code;
      this.books = new HashMap<>();
   }

   // Adds a book to the library if it doesn't already exist
   // Returns true if the book was added successfully, false otherwise
   public boolean addBook(Book book) {
      if (books.containsKey(book.getBookId())) {
         return false; // book already exists in library
      }
      books.put(book.getBookId(), book);
      return true;
   }

   // Removes a book from the library by its ID
   // Returns true if the book was removed successfully, false otherwise
   public boolean removeBookById(int id) {
      if (books.containsKey(id)) {
         books.remove(id);
         return true;
      }
      return false; // book with given ID not found in library
   }

   // Finds a book in the library by its ID
   // Throws an exception if the book is not found
   public Book findBookById(int bookId) throws Exception {
      if (books.containsKey(bookId)) {
         return books.get(bookId);
      }
      throw new Exception("Book not found");
   }

   // Returns a list of all available books in the library
   public List<Book> getAvailableBooks() {
      List<Book> availableBooks = new ArrayList<>();
      for (Map.Entry<Integer, Book> entry : books.entrySet()) {
         Book book = entry.getValue();
         if (book.isAvailable()) {
            availableBooks.add(book);
         }
      }
      return availableBooks;
   }

   // Returns a list of all borrowed books in the library
   public List<Book> getBorrowedBooks() {
      List<Book> borrowedBooks = new ArrayList<>();
      for (Map.Entry<Integer, Book> entry : books.entrySet()) {
         Book book = entry.getValue();
         if (!book.isAvailable()) {
            borrowedBooks.add(book);
         }
      }
      return borrowedBooks;
   }

   // Returns a list of all books in the library
   public List<Book> getBooks() {
      return new ArrayList<>(books.values());
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
