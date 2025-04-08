package org.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", 1980);
        Book book2 = new Book("Data Structures", "jane Smith", 1994);

        library.addBook(book1);
        library.addBook(book2);

        User user1 = new User("mahdi Rahimzadeh", "sdf4f5d", "rahimzadehm65@gmail.com", "09395582443", "mard", 23);

        user1.borrowBook(book1);
        user1.borrowBook(book2);
        user1.returnBook(book1);
        library.displayAllBooks();
    }
}
