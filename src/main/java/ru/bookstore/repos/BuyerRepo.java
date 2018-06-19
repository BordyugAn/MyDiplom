package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.BuyerEntity;

public interface BuyerRepo extends CrudRepository<BuyerEntity, Long> {
    BuyerEntity findByEmail(String email);
}
