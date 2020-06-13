package com.mackittipat.graphqlserver.repository;

import com.mackittipat.graphqlserver.domain.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepo extends PagingAndSortingRepository<Book, Long> {
}
