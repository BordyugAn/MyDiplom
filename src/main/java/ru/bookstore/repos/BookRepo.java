package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.BookEntity;

public interface BookRepo extends CrudRepository<BookEntity, Long> {
}
