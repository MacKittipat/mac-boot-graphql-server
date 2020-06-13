package com.mackittipat.graphqlserver.resolver;

import com.mackittipat.graphqlserver.domain.Author;
import com.mackittipat.graphqlserver.repository.AuthorRepo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private AuthorRepo authorRepo;

    public Author findAuthorById(Long id) {
        return authorRepo.findById(id).orElse(null);
    }

    public Iterable<Author> findAllAuthor() {
        return authorRepo.findAll();
    }
}
