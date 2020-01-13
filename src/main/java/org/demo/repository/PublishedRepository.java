package org.demo.repository;

import org.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublishedRepository extends CrudRepository<Publisher,Long> {
}
