package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.BuyerEntity;

import java.util.List;

public interface BuyerRepo extends CrudRepository<BuyerEntity, Long> {
    List<BuyerEntity> findByEmail(String email);
}
