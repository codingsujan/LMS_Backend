package com.example.LMS.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {

    @Id
    public int id;

    public String name;




}
