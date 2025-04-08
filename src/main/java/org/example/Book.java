package org.example;

import static java.lang.System.*;

public class Book extends Library{
     //properties
     private String title;
     private String author;
     private int publicationYear;
     private boolean isAvailable;

     //methods
     //constructor
     public Book(String title , String author , int publicationYear) {
          this.title = title;
          this.author = author;
          this.publicationYear = publicationYear;
          isAvailable = true;
     }

     //getter & setter
     public String getTitle(){
          return title;
     }
     public void setTitle(String newTitle){
          this.title = newTitle;
     }

     public String getAuthor(){
          return author;
     }
     public void setAuthor(String newAuthor){
          this.author = newAuthor;
     }

     public int getPublicationYear(){
          return publicationYear;
     }

     public void setPublicationYear(int newYear){
          if (newYear <= 0){
               out.println("Invalid year");
          }else{
               this.publicationYear = newYear;
          }
     }

     public boolean isAvailable(){
          return isAvailable;
     }
     public void setAvailable(boolean newAvailable){
          this.isAvailable = newAvailable;
     }

     //display books info
     void displayInfo(){
          out.println("Title: " + title);
          out.println("Author : " + author);
          out.println("Publication Year: " + publicationYear);
     }
     //edit Books info
     void editInfo(String newTitle, String newAuthor, int newYear){
          setTitle(newTitle);
          setAuthor(newAuthor);
          setPublicationYear(newYear);
     }

}
