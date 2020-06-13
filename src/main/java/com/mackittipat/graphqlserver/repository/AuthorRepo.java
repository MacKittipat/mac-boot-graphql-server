package com.mackittipat.graphqlserver.repository;

import com.mackittipat.graphqlserver.domain.Author;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorRepo extends PagingAndSortingRepository<Author, Long> {
}
