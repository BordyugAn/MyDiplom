package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.PublishHouseEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface PublishHouseRepo extends CrudRepository<PublishHouseEntity, Long> {

    @Transactional
    void deleteByName(String name);

    List<PublishHouseEntity> findAllByOrderByName();
}
