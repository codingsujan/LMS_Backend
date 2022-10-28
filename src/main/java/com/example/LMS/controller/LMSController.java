package com.example.LMS.controller;

import com.example.LMS.model.Book;
import com.example.LMS.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class LMSController {

    @GetMapping("/lms")
    public String testing(){

        return "I am connected";
    }

    @GetMapping("/getBookDetails")
    public List getBookDetails(){
        List books=new ArrayList();
        User user1 = new User();
        user1.id=1;
        user1.name="Sujan";

        Book book1 = new Book();
        book1.bookId=100;
        book1.bookName="Advance Web Engineering";
        book1.user=user1;

        User user2 = new User();
        user2.id=2;
        user2.name="Lokesh";

        Book book2 = new Book();
        book2.bookId=101;
        book2.bookName="Computer System Architecture";
        book2.user=user1;

        books.add(book1);
        books.add(book2);

        return books;

    }
}
