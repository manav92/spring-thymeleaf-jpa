package org.demo.bootstrap;

import org.demo.model.Author;
import org.demo.model.Book;
import org.demo.model.Publisher;
import org.demo.repository.AuthorRepository;
import org.demo.repository.BookRepository;
import org.demo.repository.PublishedRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrapClass implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublishedRepository publishedRepository;

    //constructor autowiring by default
    public DevBootstrapClass(AuthorRepository authorRepository, BookRepository bookRepository, PublishedRepository publishedRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publishedRepository = publishedRepository;
    }
    private void initData(){

        Publisher p1 = new Publisher("One", "NY");
        Author jane = new Author("Jane","Austin");
        Book emma = new Book("121", "Emma" , p1);
        jane.getBooks().add(emma);
        emma.getAuthors().add(jane);
        publishedRepository.save(p1);
        authorRepository.save(jane);
        bookRepository.save(emma);

        Author rod = new Author("Rod","Johnson");
        Book b1 = new Book("122","J2EE design dev", p1);
        rod.getBooks().add(b1);
        authorRepository.save(rod);
        bookRepository.save(b1);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
