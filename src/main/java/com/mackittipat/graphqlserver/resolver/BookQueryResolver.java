package com.mackittipat.graphqlserver.resolver;

import com.mackittipat.graphqlserver.domain.Book;
import com.mackittipat.graphqlserver.repository.BookRepo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private BookRepo bookRepo;

    public Book findBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Iterable<Book> findAllBook() {
        return bookRepo.findAll();
    }
}
