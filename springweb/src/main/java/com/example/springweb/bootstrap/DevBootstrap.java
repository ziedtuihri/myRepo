package com.example.springweb.bootstrap;

import com.example.springweb.model.Author;
import com.example.springweb.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import com.example.springweb.model.Book;
import com.example.springweb.repositories.AuthorRepository;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book1);

        // Rod
        Author rod = new Author("Zied", "Tuihri");
        Book book2 = new Book("CELI B2 Italiano ", "1547", "Ziden Tuihri");
        rod.getBooks().add(book2);
        book1.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(book2);
    }
}
