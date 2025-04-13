package org.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(book2);
        library.addBook(book3);

        User user1 = new User("mahdi Rahimzadeh", "sdf4f5d", "rahimzadehm65@gmail.com", "09395582443", "mard", 23);

        user1.borrowBook(book1);
        user1.borrowBook(book2);
        user1.returnBook(book1);
        user1.borrowBook(book3);
        user1.borrowBook(book3);
        library.displayAllBooks();

    }
}
