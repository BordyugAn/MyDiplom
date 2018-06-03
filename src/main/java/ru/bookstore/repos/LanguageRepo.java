package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.LanguageEntity;

import javax.transaction.Transactional;

public interface LanguageRepo extends CrudRepository<LanguageEntity, Long> {

    @Transactional
    void deleteByName(String name);
}
