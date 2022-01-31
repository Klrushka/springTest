package com.example.springtest.aop;

import com.example.springtest.aop.models.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        Book book = context.getBean("bookBean", Book.class);

        uniLibrary.addBook("ARK", book);
        uniLibrary.addMagazine();


        context.close();

    }
}