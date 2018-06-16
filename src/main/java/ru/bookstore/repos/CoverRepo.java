package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.CoverEntity;

public interface CoverRepo extends CrudRepository<CoverEntity, Long> {
}
