package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> allBooks;
    private ArrayList<User> allUsers;

    public Library() {
        allBooks = new ArrayList<>();
        allUsers = new ArrayList<>();
    }

    public void addBook(Book book){
        allBooks.add(book);
    }

    public void removeBook(Book book){
        allBooks.remove(book);
    }

    public void findBookByTitle(String bookTitle){
        for(Book book : allBooks){
            if(book.getTitle().equals(bookTitle)){
                System.out.println("Book founded By Title: " + book.getTitle());
            }else{
                System.out.println("Book Not Founded By Title: " + book.getTitle());
            }
        }
    }

    public void displayAllBooks(){
        for(Book book : allBooks){
            System.out.println(book);
        }
    }

    public void addUser(User user){
        allUsers.add(user);
    }
    public void removeUser(User user){
        allUsers.remove(user);
    }

}
