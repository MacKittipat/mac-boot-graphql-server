package com.mackittipat.graphqlserver.resolver;

import com.mackittipat.graphqlserver.domain.Author;
import com.mackittipat.graphqlserver.repository.AuthorRepo;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private AuthorRepo authorRepo;

    public Author createAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return authorRepo.save(author);
    }

}
