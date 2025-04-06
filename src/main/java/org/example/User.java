package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {

    //attribute
    private String userName;
    private String iD;
    private String email;
    private String phone;
    private String gender;
    private int age;
    private List<Book> borrowedBooks;


    //methods
    //constructor
    public User(String userName, String iD, String email, String phone, String gender, int age) {
        this.userName = userName;
        this.iD = iD;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    //getter & setter
   public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void SetID (String iD){
        this.iD = iD;
    }

    public String getID(){
        return iD;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() 
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //main methods
    void borrowBook (Book book){}

    void returnBook (Book book){}
}
