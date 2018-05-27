package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.Genre;

public interface GenreRepo extends CrudRepository<Genre, Long> {
}
