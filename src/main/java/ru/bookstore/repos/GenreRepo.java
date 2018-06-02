package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.GenreEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface GenreRepo extends CrudRepository<GenreEntity, Long> {

    List<GenreEntity> findByName(String name);

    @Transactional
    void deleteByName(String name);
}
