package org.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", 1980);
        Book book2 = new Book("Data Structures", "jane Smith", 1994);
        Book book3 = new Book("agant", "rasell", 1980);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        user1.borrowBook(book1);
        user1.borrowBook(book2);
        user1.returnBook(book1);
        user1.borrowBook(book3);
        user1.borrowBook(book3);
        library.displayAllBooks();

    }
}
