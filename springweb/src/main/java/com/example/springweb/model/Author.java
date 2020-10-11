package com.example.springweb.model;

import com.example.springweb.Book;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
 * @Author: zied
 * @created: 04/10/2020
 */
@Entity
public class Author {

    private String firstName;
    private String lastName;
    private Long id;
    private Set<Book> books = new HashSet<>();

    public Author(){

    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
}