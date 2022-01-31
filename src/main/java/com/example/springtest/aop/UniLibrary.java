package com.example.springtest.aop;

import com.example.springtest.aop.models.Book;
import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary {

    public void getBook(Book book){
        System.out.println("uni book gotten " + book.getName());
        System.out.println("--------------------------------------------");
    }

    public void getMagazine(int a){
        System.out.println("magazine gotten");
        System.out.println("--------------------------------------------");

    }

    public String returnBook(){
        return "Book returned";
    }

    public String returnMagazine(){
        return "Book returned";
    }

    public void addBook(String person, Book book){
        System.out.println("Book added by " + person + ": " + book.getName() + " " + book.getAuthor() + " " + book.getDate());
        System.out.println("--------------------------------------------");

    }

    public void addMagazine(){
        System.out.println("Magazine added");
        System.out.println("--------------------------------------------");

    }

}
