package com.jarvis.Spring5WebApp.repositories;

import com.jarvis.Spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
