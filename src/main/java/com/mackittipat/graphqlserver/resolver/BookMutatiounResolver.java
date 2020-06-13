package com.mackittipat.graphqlserver.resolver;

import com.mackittipat.graphqlserver.domain.Author;
import com.mackittipat.graphqlserver.domain.Book;
import com.mackittipat.graphqlserver.repository.BookRepo;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutatiounResolver implements GraphQLMutationResolver {

    @Autowired
    private BookRepo bookRepo;

    public Book createBook(String title, Float price, Long authorId) {
        Author author = new Author();
        author.setId(authorId);

        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        book.setAuthor(author);

        return bookRepo.save(book);
    }
}
