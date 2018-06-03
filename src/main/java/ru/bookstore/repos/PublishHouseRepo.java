package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.PublishHouseEntity;

import javax.transaction.Transactional;

public interface PublishHouseRepo extends CrudRepository<PublishHouseEntity, Long> {

    @Transactional
    void deleteByName(String name);
}
