package com.example.springweb.model;

import com.example.springweb.model.Book;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
 * @Author: zied
 * @created: 04/10/2020
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author(){

    }

    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setBooks(Set<com.example.springweb.model.Book> books) {
        this.books = books;
    }

    public Set<com.example.springweb.model.Book> getBooks() {
        return books;
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

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if((getClass() != obj.getClass()) || obj == null) return false;

        Author author = (Author) obj;

        return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Autho {" +
                "id = " + id +
                ", First name " + firstName +
                ", Last name " + lastName +
                ", Books " + books + '}'
                ;
    }
}