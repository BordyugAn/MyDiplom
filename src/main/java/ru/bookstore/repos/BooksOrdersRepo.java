package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.BooksOrdersEntity;

public interface BooksOrdersRepo extends CrudRepository<BooksOrdersEntity, Long> {
}
