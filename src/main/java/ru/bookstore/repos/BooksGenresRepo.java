package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.BooksGenresEntity;

public interface BooksGenresRepo extends CrudRepository<BooksGenresEntity, Long> {
}
