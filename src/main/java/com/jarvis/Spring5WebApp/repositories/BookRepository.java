package com.jarvis.Spring5WebApp.repositories;

import com.jarvis.Spring5WebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
