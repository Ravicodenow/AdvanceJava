package org.java.maps.app;


import java.util.*;

/**
 * This class use for run the application.
 */
public class LibraryManager {
    Map<Integer, Book> bookCatalog = new TreeMap<>();
    SortedMap<String, Book> allBooks = new TreeMap<>();
    Map<Integer, String> borrowHistory = new LinkedHashMap<>();
    Map<Integer, Integer> popularBooks = new LinkedHashMap<>();

    public void addBook(Book book) {
        bookCatalog.put(book.getId(), book);
    }

    public void borrowBook(int bookId) {
        if (bookCatalog.containsKey(bookId)) {
            borrowHistory.put(bookId, new Date().toString());   // LinkedHashMap
            popularBooks.put(bookId, popularBooks.getOrDefault(bookId, 0) + 1); // TreeMap
        }
    }

    public void showPopularBooks() {
        System.out.println("Most popular books: ");
        popularBooks.forEach((id, count) -> System.out.println("Book ID " + id + " borrowed " + count + " times"));

    }

    public void showBorrowedBooks() {
        System.out.println("Borrowed book history: ");
        borrowHistory.forEach((id, time) -> System.out.println("Book ID " + id + " at " + time));

    }
}
