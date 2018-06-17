package ru.bookstore.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.BookEntity;

import java.util.List;

public interface BookRepo extends CrudRepository<BookEntity, Long> {
    List<BookEntity> findByName(String name);
}
