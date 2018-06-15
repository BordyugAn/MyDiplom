package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.AuthorEntity;

import javax.transaction.Transactional;
import java.util.List;


public interface AuthorRepo extends CrudRepository<AuthorEntity, Long> {
    List<AuthorEntity> findAllByOrderBySurname();

    @Transactional
    void deleteByNameAndSurname(String name, String surname);
}
