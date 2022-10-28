package com.example.LMS.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    public int bookId;

    public String bookName;

    @ManyToOne
    public User user;
}
