package org.demo;

import org.demo.model.Author;
import org.demo.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Set;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
      //  Book b1 = new Book("123","Maven Book", "ABC Corp");
      //  Author a1 = new Author("manav ","rajora");
      //  b1.setAuthors(Collection);
    }

}
