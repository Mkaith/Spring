package com.jarvis.Spring5WebApp.repositories;

import com.jarvis.Spring5WebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
