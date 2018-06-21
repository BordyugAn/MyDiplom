package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.StatusEntity;

public interface StatusRepo extends CrudRepository<StatusEntity, Long> {
}
