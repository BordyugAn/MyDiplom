package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.PublishHouseEntity;

public interface PublishHouseRepo extends CrudRepository<PublishHouseEntity, Long> {
}
