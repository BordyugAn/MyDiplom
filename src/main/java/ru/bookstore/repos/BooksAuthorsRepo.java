package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.BooksAuthorsEntity;

import java.util.List;

public interface BooksAuthorsRepo extends CrudRepository<BooksAuthorsEntity, Long> {
    List<BooksAuthorsEntity> findByBook(int book);
}
