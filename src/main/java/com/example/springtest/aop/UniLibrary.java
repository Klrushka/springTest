package com.example.springtest.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("uni book gotten");
    }

    public void getMagazine(){
        System.out.println("magazine gotten");
    }

    public String returnBook(){
        return "Book returned";
    }
}
