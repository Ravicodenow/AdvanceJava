package org.java.maps.app;

public class LibraryManagementSystem {
        public static  void main(String[] args){
            LibraryManager libraryManager = new LibraryManager();
            libraryManager.addBook( new Book(1001,"Clean Code","Robert C. Martin"));
            libraryManager.addBook( new Book(1004,"Mythical Man-month","Frederick Brooks"));
            libraryManager.addBook( new Book(1011,"Pragmatic Programmer","Your Journey to Mastery"));
            libraryManager.addBook( new Book(1009,"Code Complete","Steve McConnell"));
            libraryManager.addBook( new Book(1007,"The Art of Computer Programming","David Thomas"));

            libraryManager.borrowBook(1007);
            libraryManager.borrowBook(1007);
            libraryManager.borrowBook(1007);
            libraryManager.borrowBook(1009);
            libraryManager.borrowBook(1009);
            libraryManager.borrowBook(1001);
            libraryManager.borrowBook(1011);

            libraryManager.showBorrowedBooks();
            libraryManager.showPopularBooks();

        }
}
